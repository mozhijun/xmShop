package com.xmlvhy.shop.vo;

import com.xmlvhy.shop.pojo.Order;
import com.xmlvhy.shop.pojo.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-24 16:44
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderVo extends Order{
    /*订单中包含的类目*/
    private List<OrderItem> orderItemList;
}
