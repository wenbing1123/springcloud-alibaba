package cn.ywb.springcloudalibaba.service.order.impl.dao.entity;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Order {

    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;

}
