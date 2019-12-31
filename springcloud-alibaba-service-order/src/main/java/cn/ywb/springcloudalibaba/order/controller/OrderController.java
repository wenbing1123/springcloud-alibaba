package cn.ywb.springcloudalibaba.order.controller;

import cn.ywb.springcloudalibaba.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("order")
@Api("订单服务")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ApiOperation("创建订单")
    public Mono<String> createOrder() {

        orderService.createOrder();

        return Mono.just("success");
    }

}
