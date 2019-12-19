package com.ipps.admin.mapper;

import com.ipps.admin.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    String SELECT_FIELDS = "id, loginName, name, introduction, avatar, crtTime, modTime, status";

    @Select("Select " + SELECT_FIELDS + " from USER where loginName=#{loginName}")
    UserEntity getByLoginName(String loginName);
}
