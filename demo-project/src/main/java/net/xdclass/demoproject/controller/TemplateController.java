package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* @
 * @ClassName TemplateController
 * @Description
 * @Author cy
 * @Date 2020-07-13 16:32
 * Version 1.0
 **/
@Controller
@RequestMapping("tpl")
public class TemplateController {

    @Autowired
    private WxConfig wxConfig;

    @GetMapping("test")
    public String test(ModelMap modelMap){
        modelMap.addAttribute("setting",wxConfig);
        //不用添加后最，因为配置文件里面已经指定了后缀
        return  "fm/user/index";
    }

    @GetMapping("thymeleaf")
    public String thymeleaf(ModelMap modelMap){
        modelMap.addAttribute("setting",wxConfig);
        //不用添加后最，因为配置文件里面已经指定了后缀
        return  "t1/index";
    }
}
