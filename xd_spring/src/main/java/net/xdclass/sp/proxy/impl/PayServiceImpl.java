package net.xdclass.sp.proxy.impl;

import net.xdclass.sp.proxy.PayService;
import org.springframework.stereotype.Service;

/* @
 * @ClassName PayServiceImpl
 * @Description
 * @Author cy
 * @Date 2020-07-21 14:06
 * Version 1.0
 **/
public class PayServiceImpl implements PayService {

    @Override
    public String callback(String ouTradeNo) {
        System.out.println("目标类 PayServiceImpl 回调方法callback");
        return ouTradeNo;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("目标类 PayService 回调方法 save");
        return productId;
    }
}
