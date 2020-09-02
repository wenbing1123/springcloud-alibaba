package cn.ywb.springcloudalibaba.service.order.impl.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("order")
@Api("订单服务")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ApiOperation("创建订单")
    public Mono<String> createOrder() {

        orderService.createOrder();

        return Mono.just("success");
    }

}
