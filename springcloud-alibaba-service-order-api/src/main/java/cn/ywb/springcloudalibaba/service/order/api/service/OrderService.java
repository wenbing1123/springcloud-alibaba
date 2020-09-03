package cn.ywb.springcloudalibaba.service.order.api.service;

import cn.ywb.springcloudalibaba.service.order.api.dto.OrderResult;

public interface OrderService {

    /**
     * 创建订单
     */
    OrderResult create(String userId, String commodityCode, int orderCount);

}
