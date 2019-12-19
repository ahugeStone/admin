package com.ipps.admin.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {
    private String id;
    private String name;
    private String introduction;
    private String avatar;
    private Date crtTime;
    private Date modTime;
    private String status;
}
