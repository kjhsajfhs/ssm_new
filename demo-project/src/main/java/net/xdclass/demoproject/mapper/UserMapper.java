package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* @
 * @ClassName UserMapper
 * @Description
 * @Author cy
 * @Date 2020-07-09 10:51
 * Version 1.0
 **/
@Repository
public class UserMapper {

    private static Map<String, User> userMap = new HashMap<>();
    static {
        userMap.put("jack",new User(1,"jack","123"));
        userMap.put("xdclass",new User(2,"xdclass-lw","123456"));
        userMap.put("tom",new User(3,"xdclass-tom","123456789"));
    }
    public User login(String username,String pwd){
        User user = userMap.get(username);
        if (user == null){
            return  null;
        }
        if (user.getPwd().equals(pwd)){
            return  user;
        }
        return  null;
    }

    public List<User> listUser(){
        ArrayList<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }

}
