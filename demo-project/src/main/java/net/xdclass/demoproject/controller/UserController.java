package net.xdclass.demoproject.controller;


import net.xdclass.demoproject.domain.User;
import net.xdclass.demoproject.mapper.UserMapper;
import net.xdclass.demoproject.service.UserService;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/* @
 * @ClassName UserController
 * @Description
 * @Author cy
 * @Date 2020-07-09 11:27
 * Version 1.0
 **/
@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        String token = userService.login(user.getUsername(), user.getPwd());
        return token==null?JsonData.buildError("账号密码错误"):JsonData.buildSuccess(token);
    }

    @GetMapping("list_user")
    public JsonData listUser(){
      return   JsonData.buildSuccess(userService.listUser());
    };
}
