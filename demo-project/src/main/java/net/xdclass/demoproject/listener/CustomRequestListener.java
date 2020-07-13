package net.xdclass.demoproject.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/* @请求监听
 * @ClassName CustomRequestListener
 * @Description
 * @Author cy
 * @Date 2020-07-13 15:03
 * Version 1.0
 **/
@WebListener
public class CustomRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestoryed====");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized===");

    }
}
