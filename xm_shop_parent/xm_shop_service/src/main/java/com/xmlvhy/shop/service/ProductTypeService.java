package com.xmlvhy.shop.service;

import com.xmlvhy.shop.common.exception.ProductTypeExistException;
import com.xmlvhy.shop.pojo.ProductType;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-09 11:34
 * Description: 商品类型信息业务层接口
 */
public interface ProductTypeService {

    /**
     *功能描述: 查询所有商品类型信息
     * @Author 小莫
     * @Date 11:35 2019/03/09
     * @Param []
     * @return java.util.List<com.xmlvhy.shop.pojo.ProductType>
     */
    List<ProductType> findAll();

    List<ProductType> findAllValidStatus();

    /**
     *功能描述: 添加商品类型
     * @Author 小莫
     * @Date 21:47 2019/03/09
     * @Param [name]
     * @return void
     */
    void addProductType(String name) throws ProductTypeExistException;

    /**
     *功能描述: 根据 id 查询商品类型信息
     * @Author 小莫
     * @Date 21:47 2019/03/09
     * @Param [id]
     * @return com.xmlvhy.shop.pojo.ProductType
     */
    ProductType findProductTypeById(Integer id);

    /**
     *功能描述: 修改商品类型的名称
     * @Author 小莫
     * @Date 22:13 2019/03/09
     * @Param [id, name]
     * @return int
     */
    int modifyProductTypeName(int id , String name);

    /**
     *功能描述: 修改商品类型的状态
     * @Author 小莫
     * @Date 22:13 2019/03/09
     * @Param [id, status]
     * @return int
     */
    int modifyProductTypeStatus(int id);

    /**
     *功能描述: 根据id删除商品类型信息
     * @Author 小莫
     * @Date 22:14 2019/03/09
     * @Param [id]
     * @return int
     */
    int removeProductTypeById(int id);

    List<ProductType> findAllEnableProductTypes();
}
