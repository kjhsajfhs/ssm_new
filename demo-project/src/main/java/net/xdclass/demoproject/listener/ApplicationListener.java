package net.xdclass.demoproject.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/* @应用上下文监听器  应用启动监听
 * @ClassName ApplicationListener
 * @Description
 * @Author cy
 * @Date 2020-07-13 14:57
 * Version 1.0
 **/
@WebListener
public class ApplicationListener  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitalized2===");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed====");

    }
}
