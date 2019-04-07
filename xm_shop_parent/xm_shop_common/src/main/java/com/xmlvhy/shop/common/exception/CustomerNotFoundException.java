package com.xmlvhy.shop.common.exception;

/**
 * Author: 小莫
 * Date: 2019-03-14 10:53
 * Description: 用户不存在自定义异常
 */
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException() {
    }

    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
