package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WxConfig;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/* @
 * @ClassName TestController
 * @Description
 * @Author cy
 * @Date 2020-07-10 17:01
 * Version 1.0
 **/
@RestController
@RequestMapping("app/v1/test")
@PropertySource("classpath:pay.properties")
public class TestController {

    @Autowired
    private WxConfig wxConfig;

    @GetMapping("get_config")
    public JsonData testConfig(){
        System.out.println(12345);
        HashMap<Object, Object> map = new HashMap<>();
        System.out.println(43434);
        map.put("appid",wxConfig.getPayAppid());
        map.put("secret",wxConfig.getPaySecret());
        map.put("mechId",wxConfig.getPayMechId());
        return JsonData.buildSuccess(map);
    }
}
