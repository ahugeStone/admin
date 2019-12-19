package com.ipps.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.ipps.admin.bo.RspEntity;
import com.ipps.admin.entity.UserEntity;
import com.ipps.admin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基本接口
 *
 * @author ahuang
 * @version V1.0
 * @Title: CommonController
 * @Program: admin
 * @Package com.ipps.admin.controller
 * @create 2019-12-18 22:34
 */
@Slf4j
@RestController
@RequestMapping("/prod-api")
public class CommonController {
    @Autowired
    UserService userService;

    @RequestMapping(path="/user/login",method = { RequestMethod.POST })
    public RspEntity login(@RequestBody Map<String, Object> req) {
        String username = (String) req.get("username");
        RspEntity result = new RspEntity();

        UserEntity user = userService.getByLoginName(username);
        log.info(user.toString());

        Map<String, Object> data = new HashMap<>();
        data.put("token", "admin-token");
        result.setCode(20000);
        result.setData(data);
        return result;
    }

    @RequestMapping(path="/user/logout",method = { RequestMethod.POST })
    public RspEntity logout() {
        RspEntity result = new RspEntity();
        result.setCode(20000);
        result.setData("success");
        return result;
    }

    @RequestMapping(path="/user/info",method = { RequestMethod.GET })
    public Map<String, Object> info() {
        UserEntity user = userService.getByLoginName("admin");

        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = BeanUtil.beanToMap(user);
        List<String> items = new ArrayList();
        items.add("admin");
        data.put("roles", items);
        result.put("code",20000);
        result.put("data",data);
        return result;
    }

    @RequestMapping(path="/user/list",method = { RequestMethod.GET })
    public Map<String, Object> list() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        Map<String, Object> item = new HashMap<>();
        item.put("order_no", "D57D6C1c-0bb4-d5BA-AFb8-9d48969099Cb");
        item.put("timestamp", 958689478613L);
        item.put("username", "Angela Lewis");
        item.put("price", "4371");
        item.put("status", "pending");
        List<Map> items = new ArrayList();
        items.add(item);

        data.put("total", 1);
        data.put("items", items);
        result.put("code",20000);
        result.put("data",data);
        return result;
    }
}
