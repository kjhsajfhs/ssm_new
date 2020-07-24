package net.xdclass.sp.test;

import net.xdclass.sp.proxy.PayService;
import net.xdclass.sp.proxy.impl.CglibProxy;
import net.xdclass.sp.proxy.impl.JdkProxy;
import net.xdclass.sp.proxy.impl.PayServiceImpl;
import net.xdclass.sp.proxy.impl.StaticProxyPayServiceImpl;

/* @
 * @ClassName ProxTestg
 * @Description
 * @Author cy
 * @Date 2020-07-21 14:09
 * Version 1.0
 **/
public class ProxTest {

    public static void main(String[] args) {
      /*  PayService payService = new PayServiceImpl();
        payService.callback("1234556778");*/


/*       静态代理
        PayService payService = new StaticProxyPayServiceImpl(new PayServiceImpl());
        payService.save(1,321);*/

/*       //JDK动态代理
        JdkProxy jdkProxy = new JdkProxy();

        //获取代理类对象
        PayService payService = (PayService) jdkProxy.newProxyInstance(new PayServiceImpl());

        //调用目标方法
        payService.callback("12334444");*/



      //CGlib动态代理
     CglibProxy cglibProxy = new CglibProxy();
     PayService payService= (PayService) cglibProxy.newProxyInstance(new PayServiceImpl());

     //调用目标方法
        payService.save(2222,3333);



    }
}
