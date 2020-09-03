package cn.ywb.springcloudalibaba.service.order.impl.service;

import cn.ywb.springcloudalibaba.service.account.api.service.AccountService;
import cn.ywb.springcloudalibaba.service.order.api.dto.OrderResult;
import cn.ywb.springcloudalibaba.service.order.api.service.OrderService;
import cn.ywb.springcloudalibaba.service.order.impl.dao.entity.Order;
import cn.ywb.springcloudalibaba.service.order.impl.dao.repository.OrderRepo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepo orderRepo;

    @Reference
    private AccountService accountService;

    @Override
    public OrderResult create(String userId, String commodityCode, int orderCount) {
        int orderMoney = calculate(commodityCode, orderCount);
        accountService.debit(userId, orderMoney);

        Mono<Order> orderMono = orderRepo.save(Order
                .builder()
                .userId(userId)
                .commodityCode(commodityCode)
                .count(orderCount)
                .money(orderMoney)
                .build());
        return null;
    }

    private int calculate(String commodityCode, int orderCount) {
        return 0;
    }
}
