package com.xmlvhy.shop.common.exception;

/**
 * Author: 小莫
 * Date: 2019-03-12 11:43
 * Description: 自定义系统用户登录异常
 */
public class SystemUserLoginException extends RuntimeException {
    public SystemUserLoginException() {
        super();
    }

    public SystemUserLoginException(String message) {
        super(message);
    }

    public SystemUserLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
