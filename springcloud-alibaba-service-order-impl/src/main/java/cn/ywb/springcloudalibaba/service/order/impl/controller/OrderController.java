package cn.ywb.springcloudalibaba.service.order.impl.controller;

import cn.ywb.springcloudalibaba.service.order.api.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("order")
@Api(tags = "订单服务")
public class OrderController {

    @Resource
    private OrderService orderService;

}
