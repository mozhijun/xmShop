package com.xmlvhy.shop.service;

import com.xmlvhy.shop.pojo.Cart;
import com.xmlvhy.shop.vo.CartVo;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-19 16:06
 * Description:购物车业务接口
 */
public interface CartService {

    Boolean saveToCart(CartVo cartVo);

    List<Cart> findCustomerAllCarts(Integer customerId);

    Boolean modifyCartStatus(Integer id);

    Boolean modifyCartStatusByCartIdAndCustomerId(Integer cartId, Integer id);

    Boolean modifyCartStatusByCartIdAndCustomerIds(Integer[] cartIds, Integer customerId);

    Boolean modifyNumAndPriceByCartIdAndCustomerIdAndStatus(Integer cartId, Integer productNum, Integer id);

    List<Cart> findCartByCartIdsAndCustomerId(Integer[] orderCartIds, Integer id);

    List<Cart> findRedirectCartByCartIdsAndCustomerId(Integer[] orderCartIds, Integer id);

    int redirectToCart(CartVo cartVo);
}
