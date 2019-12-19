package com.ipps.admin.service;

import com.ipps.admin.entity.UserEntity;

public interface UserService {
    /**
     * 通过登录名获取登录用户
     * @param loginName
     * @return
     */
    UserEntity getByLoginName(String loginName);
}
