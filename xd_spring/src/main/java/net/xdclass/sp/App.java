package net.xdclass.sp;

import net.xdclass.sp.dao.VideoOrder;
import net.xdclass.sp.domian.Video;
import net.xdclass.sp.domian.Video2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* @
 * @ClassName App
 * @Description
 * @Author cy
 * @Date 2020-07-16 11:57
 * Version 1.0
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
 /*       Video video = (Video)applicationContext.getBean("video");
        System.out.println(video.toString());*/
  /*      VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
        System.out.println(videoOrder.getOutTradeNo());
        System.out.println(videoOrder.getVideo().getTitle());*/
        testInject(applicationContext);


    }

    //注入测试
    private static void testInject(ApplicationContext context){
        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
        System.out.println(videoOrder.getVideo().getTitle());

    }

    //作用域测试
    private static void testScope(ApplicationContext context){
        Video video1 = (Video)context.getBean("video");
        Video video2 = (Video)context.getBean("video");
//靠匹配内存地址，== 是匹配内存地址
        System.out.println( video1 == video2 );
    }
}
