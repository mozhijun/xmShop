# xmShop 					

**基于SSM+Bootstrap+Maven+Redis+Mysql的商城系统**

> 我的博客：[https://www.xmlvhy.com](https://www.xmlvhy.com "https://www.xmlvhy.com")

##### 一、整体框架介绍
###### 1.1、背景
在学习 SSM 以及 Boostrap框架时，为了整合所学（微信支付、登录or支付宝支付等）知识，这个购物商城项目也就出现了...对于ssm初学者来说，应该比较适合练手学习，可以根据自己想法进行功能扩展等...

###### 1.2、整体架构图
目前项目基本实现的功能有，商城后端：用户登录、商品管理、商品类型管理、客户管理以及系统用户管理（订单管理功能后续有空实现...）；商城前端：商品页面展示、商品详情页、加入购物车、立即购买、我的订单、购物车、个人中心（这里实现比较简单）、客户注册、客户登录、订单管理、订单支付（支付宝和微信）、收货地址管理等

**整体框架图**

![](https://www.xmlvhy.com/images/xmshop/xmshop.png)

##### 二、技术选型
###### 2.1、技术组合
- 数据库：Mysql
- 技术组合：Spring、SpringMvc、Mybatis、Redis、Jsp
- 前端框架：BootStrap3
- Lombok
- 其它：HttpClient4.x、Google ZXing 生成二维码、微信支付、支付宝沙箱模拟支付、聚合数据接口（短信）开发、文件上传 FTP 服务器等

##### 三、开发环境
###### 3.1、工具与环境
- IDEA 2017.3.5
- Maven 3
- JDK8
- Mysql 5.7+
- Win10 64位系统
- 项目部署：阿里云服务器

##### 四、项目演示
###### 4.1、后端演示

**相关页面截图：**

![](https://www.xmlvhy.com/images/xmshop/back6.png)

![](https://www.xmlvhy.com/images/xmshop/back1.png)

![](https://www.xmlvhy.com/images/xmshop/back2.png)

![](https://www.xmlvhy.com/images/xmshop/back3.png)

![](https://www.xmlvhy.com/images/xmshop/back4.png)

![](https://www.xmlvhy.com/images/xmshop/back5.png)

**项目演示地址：**

[https://www.xmlvhy.com/xmShopBack/](https://www.xmlvhy.com/xmShopBack/showLogin "https://www.xmlvhy.com/xmShopBack/")

账户名：test
密码：test

###### 4.2、前端演示

**相关页面截图：**

![](https://www.xmlvhy.com/images/xmshop/front.png)

![](https://www.xmlvhy.com/images/xmshop/front1.png)

![](https://www.xmlvhy.com/images/xmshop/front2.png)

![](https://www.xmlvhy.com/images/xmshop/front3.png)

![](https://www.xmlvhy.com/images/xmshop/front4.png)

![](https://www.xmlvhy.com/images/xmshop/front5.png)

![](https://www.xmlvhy.com/images/xmshop/front6.png)

![](https://www.xmlvhy.com/images/xmshop/front7.png)

![](https://www.xmlvhy.com/images/xmshop/front8.png)

![](https://www.xmlvhy.com/images/xmshop/front9.png)

![](https://www.xmlvhy.com/images/xmshop/front10.png)

![](https://www.xmlvhy.com/images/xmshop/front11.png)

![](https://www.xmlvhy.com/images/xmshop/front12.png)

![](https://www.xmlvhy.com/images/xmshop/front13.png)

![](https://www.xmlvhy.com/images/xmshop/front14.png)

**项目演示地址：**

[https://www.xmlvhy.com/xmShopFront](https://www.xmlvhy.com/xmShopFront/front/product/searchAllProducts "https://www.xmlvhy.com/xmShopFront")

**备注：**

- 项目中涉及支付宝支付，由于是沙箱环境支付，需要下载，沙箱环境的支付宝钱包（[https://sandbox.alipaydev.com/user/downloadApp.htm](https://sandbox.alipaydev.com/user/downloadApp.htm "https://sandbox.alipaydev.com/user/downloadApp.htm")）
- 微信支付，这里使用的是 [小D课堂](https://xdclass.net "小D课堂") 提供的微信开发者账户，此账户提供了微信扫码支付统一下单接口，没有商户号也可以完成支付功能开发。（需要的话可以自行到官网注册一个账号即可）
- 最后，支付过程中，支付宝沙箱支付不会产生任何交易信息的，微信支付会产生实际交易，商品价格最少0.1元！

**项目涉及完整代码以及数据库脚本，详情见如下：**

[https://www.xmlvhy.com/](https://www.xmlvhy.com/blog/blog/30 "https://www.xmlvhy.com/")