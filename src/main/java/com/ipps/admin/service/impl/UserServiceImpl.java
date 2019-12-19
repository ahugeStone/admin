package com.ipps.admin.service.impl;

import com.ipps.admin.entity.UserEntity;
import com.ipps.admin.mapper.UserMapper;
import com.ipps.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserEntity getByLoginName(String loginName) {
        return userMapper.getByLoginName(loginName);
    }
}
