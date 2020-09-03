package cn.ywb.springcloudalibaba.business.purchase.impl.service;

import cn.ywb.springcloudalibaba.business.purchase.api.service.PurchaseService;
import cn.ywb.springcloudalibaba.service.order.api.service.OrderService;
import cn.ywb.springcloudalibaba.service.storage.api.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Reference
    private StorageService storageService;

    @Reference
    private OrderService orderService;

    @GlobalTransactional
    @Override
    public void purchase(String userId, String commodityCode, int orderCount) {
        // 扣减库存
        storageService.deduct(commodityCode, orderCount);

        // 创建订单
        orderService.create(userId, commodityCode, orderCount);
    }

}
