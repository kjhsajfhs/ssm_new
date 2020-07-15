package net.xdclass.online_class.dao;

import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.VideoOrder;

import java.util.List;

public interface VideoOrderMapper {

    /*查询全部订单，关联用户信息*/
    List<VideoOrder> queryVideoOrderList();


    /*查询全部用户的订单*/
    List<User> queryUserOrder();
}
