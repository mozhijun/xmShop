package com.xmlvhy.front.shop.config;

/**
 * Author: 小莫
 * Date: 2019-04-02 14:35
 * Description:<描述>
 */
public class AliPayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092600601077";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCylqgEnzPA1urV92Gpwj30ZLn9/tK481BmDFz/8J6gDJvOrD0daA794mX/sOcK61yaA9Rix1AiSpQaBCLqfL/Wedtj/5XPBcgWzKkJKzDw6CXjzQLHp4gsRfQfLgQ88hNJguPiD4eD9caXsoGCJpS3yK9TlZFhMURn9O7fqxwuLNZenbA0RZwhGeBnX7DID2KlbSR27zug0AG85nkhXlPFZiprMdTb8zjDU7q/w2KtVBYhXxAhJToCXUJW9wk+KiLOn/1ppcd//jYL02Nm9iLhcOByU8pyRuWJ8FYP/NIBUtivlvm33Hy+0cxrZO8w5rlfsEseaVB8T5tm3kaHuuXvAgMBAAECggEAZqwy4KVeralhza2x2lUwJUebnqlYILjSKjlFZmfB6qYVFZb0c+mVZOU6WuwriJ2T2YAGJNwN+AkEaIikQkeCSx43wZ/5UtIyHNmA/SJ1uqrczcDZrktlAH8fQKXGDfvmlsbHmPnwoS82A5S+3EKuEZMxKU6+DDC08Udh5fmL9AchBfQqUYjconBymE2zO09DyUtnoYePDmJyNsQMwBd7ug1WSPXBxG6udFo16IrNnQCwQ9iw90aLZ23uoZZcK578H6IuQNa96ctH4pan0pFjdra06CIZap3WE28uT2df9tOXRJ2TUiv9d7WzNb1XxBJq+vGTbGU3kgsd+QBximN00QKBgQDfh2mWTI/L0MP9qADgqwyZhczPp6SZtPSDzC+gRQEAQlOLWxNz9JrkedTordS7EZgnlZrR+x96IJ6JWdmaodfqx/J9ynxv8ZNEaYR/Y5nIBY6kC9ywBHI7NaswfgkAYeSovAf/wSEegttlGXitjYkgAaa1zrFGFSl/vHBQktvg3QKBgQDMh//ui5HltRbeBvDT/iyosmCpTHoz+XaTxPFdKSPOUUMvfyOebsEzqrgOEr4kO5rLK6xnBiH/AIq0Q1lR19wNVuB/iIQHXW98F2032RBoHvUBM5vnpIflt6L+MwXh+AFk/LmozKbn4Ka2YjZOKE3NPYCCnQV7zocsSLkW+MOvOwKBgQCcPRogZANegt17PyLd5rE33b36p0L17PW76cygSZsZg0LB9TbzpdVePYoD2P0IhJPFl1xPySeHRaWKe7MN0nIJORjVs+KmnERDXT2vjP7AQKIjJ+dpYLI3kJvHmVDRY5tgFY3BxkxP90dCszsWlAd0x7KvAXoHcmM/VYdryjrGQQKBgD/IseHcmNVAEi+Pjo8uFxNM/aQOe5W12Grg4jyhVc9DvGYVijAgbhQEy31oDvARvoZZylwep3901cy9rB8/6Boo274p/rKlSt0yGRdvlBREgzeqtpYY02CqUiRgGReNVjH+NpATsoFhp9v86N6a5xh4c5lICqu/jpwa2c32KmB9AoGAMn+82qi7HGaGLIP86B0jtCWKn+rFn/nAJjKcGl6z1uoC3FVZ/pEZ2h3v0vw4VY6qm8cGduN3F2ryaBHRb1g/DA/F7xm+lfpaCip2zl0NbDgY8yLH9Ou/HmpvECa126T2D07dPYMbQ4epR4FlEpajM6F6IvbavbNjwjwJLe8of50=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAz9xYZrFs/yGZMF4E5HbgUll4ZUX7Wnm3zxyUh8mgpkD499bqKKDpBnyyxCCzExSN5/LV+tO7PDbu5IWt+ooaBdEamyKZInIXpfCTPSFGqR3X8tQPoVzHuHXnmNlMN271Tdb4/yBK2YA2hGhMpuZFCTpRqYdqy51hkzIEK6PK954rA7pXGs9BDzVCE2RLa4lscXGEfEoCBbREVzsXai98xnoypfy3H66v19ka7Ngiy2FqSBAKWmDUrspFOu8uSHp13sApC4M7GFQhMxulGoQ9Q5q3MoUIi0EwSGKOYHLpJN86HXqDpWe7vNzq40Se5eF0FuG5w3JqZJ3rBQMX8DBSrQIDAQAB";

    /***
     *功能描述: 服务器异步通知页面路径  需 http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    //public static String notify_url = "http://xiaomo.mynatapp.cc/front/pay/aliPayNotifyNotice";

    //部署服务器上，注意修改地址：
    public static String notify_url = "https://www.xmlvhy.com/xmShopFront/front/pay/aliPayNotifyNotice";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //public static String return_url = "https://xiaomo.mynatapp.cc/front/pay/aliPayReturnNotice";
    //部署服务器上注意修改地址
    public static String return_url = "https://www.xmlvhy.com/xmShopFront/front/pay/aliPayReturnNotice";


    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
