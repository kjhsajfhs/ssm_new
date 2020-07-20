package com.redis.test_project.controller;

import com.redis.test_project.util.JsonData;
import com.redis.test_project.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @
 * @ClassName TestController
 * @Description
 * @Author cy
 * @Date 2020-07-20 09:33
 * Version 1.0
 **/
@RestController
@RequestMapping("app/v1/test")
public class TestController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("login")
    public JsonData login(){
        boolean set = redisUtil.set("user", "chenyu");
        return JsonData.buildSuccess(set);
    }

    @RequestMapping("getUser")
    public  JsonData getUser(){
        String user = redisUtil.get("user");
        return JsonData.buildSuccess(user);
    }

}
