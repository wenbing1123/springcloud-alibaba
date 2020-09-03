package cn.ywb.springcloudalibaba.service.order.impl.dao.repository;

import cn.ywb.springcloudalibaba.service.order.impl.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo  extends JpaRepository<Order, Long> {
}
