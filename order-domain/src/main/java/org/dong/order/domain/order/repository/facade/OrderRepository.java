package org.dong.order.domain.order.repository.facade;

import org.dong.order.domain.order.repository.po.OrderPO;

public interface OrderRepository {
    void insert(OrderPO orderPO);
    void update(OrderPO orderPO);
    OrderPO findById(String orderId);
}
