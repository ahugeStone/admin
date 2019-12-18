package com.ipps.admin.controller;

import lombok.extern.slf4j.Slf4j;
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
    @RequestMapping(path="/user/login",method = { RequestMethod.POST })
    public Map<String, Object> login() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        data.put("token", "admin-token");
        result.put("code",20000);
        result.put("data",data);
        return result;
    }

    @RequestMapping(path="/user/info",method = { RequestMethod.GET })
    public Map<String, Object> info() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List<String> items = new ArrayList();
        items.add("admin");
        data.put("roles", items);
        data.put("introduction", "I am a super administrator");
        data.put("avatar", "null");
        data.put("name", "Super Admin");
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
