package cn.ywb.springcloudalibaba.business.purchase.impl.controller;

import cn.ywb.springcloudalibaba.business.purchase.api.service.PurchaseService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/business/purchase")
@Slf4j
@Api(tags = "购买业务")
public class PurchaseController {

    @Resource
    private PurchaseService purchaseService;

}
