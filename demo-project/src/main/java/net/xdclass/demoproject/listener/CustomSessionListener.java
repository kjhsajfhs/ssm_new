package net.xdclass.demoproject.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/* @会话监听
 * @ClassName CustomSessionListener
 * @Description
 * @Author cy
 * @Date 2020-07-13 15:01
 * Version 1.0
 **/
@WebListener
public class CustomSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated===");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed===");
    }
}
