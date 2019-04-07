package com.xmlvhy.shop.dao;

import com.xmlvhy.shop.params.CustomerParam;
import com.xmlvhy.shop.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-12 17:34
 * Description: 客户dao 层
 */
public interface CustomerDao {

    Customer selectByLoginNameAndPassword(@Param("loginName") String loginName,
                                          @Param("password") String password,
                                          @Param("isValid") Integer isValid);

    Customer selectByPhone(String phone);

    int insertCustomer(Customer customer);

    int updateCustomerPassword(Customer customer);

    Customer selectByLoginName(String loginName);

    List<Customer> selectAllCustomers();

    List<Customer> selectCustomersByParams(CustomerParam customerParam);

    Customer selectCustomerById(int id);

    int updateCustomer(Customer customer);

    int updateCustomerStatus(@Param("id") int id, @Param("isValid") int isValid);
}
