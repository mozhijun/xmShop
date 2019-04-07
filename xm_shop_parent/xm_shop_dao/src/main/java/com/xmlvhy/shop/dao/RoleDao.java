package com.xmlvhy.shop.dao;

import com.xmlvhy.shop.pojo.Role;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-11 11:29
 * Description: 角色接口层
 */
public interface RoleDao {
    List<Role> selectAllRoles();
}
