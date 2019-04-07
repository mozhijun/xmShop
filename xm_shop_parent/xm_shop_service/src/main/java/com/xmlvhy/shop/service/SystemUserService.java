package com.xmlvhy.shop.service;

import com.xmlvhy.shop.common.exception.SystemUserLoginException;
import com.xmlvhy.shop.params.SystemUserParam;
import com.xmlvhy.shop.pojo.SystemUser;
import com.xmlvhy.shop.vo.SystemUserVo;

import java.util.List;

/**
 * Author: 小莫
 * Date: 2019-03-11 10:29
 * Description: 系统用户管理业务层接口
 */
public interface SystemUserService {

    List<SystemUser> findAllSytemUsers();

    SystemUser findSystemUserById(int id);

    int addSystemUser(SystemUserVo systemUserVo);

    int modifySystemUser(SystemUserVo systemUserVo);

    int modifySystemUserStatus(int id);

    List<SystemUser> findSystemUsersByParams(SystemUserParam systemUserParam);

    SystemUser findSystemUserByLoginName(String loginName);

    SystemUser login(String loginName, String password) throws SystemUserLoginException;

}
