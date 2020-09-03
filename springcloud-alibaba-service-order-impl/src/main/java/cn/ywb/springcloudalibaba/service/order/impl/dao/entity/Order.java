package cn.ywb.springcloudalibaba.service.order.impl.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(catalog = "t_order")
public class Order {

    @Id
    private String userId;
    private String commodityCode;
    private Integer count;
    private Integer money;

}
