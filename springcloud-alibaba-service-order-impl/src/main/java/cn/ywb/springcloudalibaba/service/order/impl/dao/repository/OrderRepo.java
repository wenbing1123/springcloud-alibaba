package cn.ywb.springcloudalibaba.service.order.impl.dao.repository;

import cn.ywb.springcloudalibaba.service.order.impl.dao.entity.Order;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface OrderRepo  extends ReactiveCrudRepository<Order, Long> {
}
