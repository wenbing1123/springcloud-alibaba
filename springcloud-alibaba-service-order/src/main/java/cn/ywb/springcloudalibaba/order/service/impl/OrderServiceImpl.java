package cn.ywb.springcloudalibaba.order.service.impl;

import cn.ywb.springcloudalibaba.order.service.OrderService;
import cn.ywb.springcloudalibaba.stock.service.StockService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Reference
    private StockService stockService;

    @Override
    public void createOrder() {

        log.info("create order start...");

        stockService.cutStock();

    }

}
