package net.xdclass.sp.proxy.impl;

import net.xdclass.sp.proxy.PayService;

/* @PayServiceImpl的静态代理
 * @ClassName StaticProxyPayServiceImpl
 * @Description
 * @Author cy
 * @Date 2020-07-21 14:12
 * Version 1.0
 **/
public class StaticProxyPayServiceImpl implements PayService {

    private PayService payService;

    public StaticProxyPayServiceImpl(PayService payService){
        this.payService=payService;
    }


    @Override
    public String callback(String ouTradeNo) {
        System.out.println("StaticProxyPayServiceImpl callback begin");
        String callback = payService.callback(ouTradeNo);
        System.out.println("StaticProxyPayServiceImpl callback end");
        return callback;
    }

    @Override
    public int save(int userId, int productId) {
        System.out.println("StaticProxyPayServiceImpl save begin");
        int save=0;
        if (userId==1){
                save = payService.save(userId,productId);
        }
        System.out.println("StaticProxyPayServiceImpl save end");
        return save;
    }
}
