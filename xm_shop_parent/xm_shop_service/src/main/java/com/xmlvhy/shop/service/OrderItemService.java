package com.xmlvhy.shop.service;

import com.xmlvhy.shop.pojo.OrderItem;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-24 16:00
 * Description: 订单明细业务接口
 */
public interface OrderItemService {
    Boolean saveOrderItem(OrderItem orderItem);

    List<OrderItem> findOrderItemsByOrderId(Integer id);
}
