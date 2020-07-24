package net.xdclass.sp;

import net.xdclass.sp.aop.AnnotationAppConfig;
import net.xdclass.sp.domian.Video;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* @
 * @ClassName App
 * @Description
 * @Author cy
 * @Date 2020-07-16 11:57
 * Version 1.0
 **/
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
        VideoService videoService = (VideoService) context.getBean("videoService");
        Video video = new Video();
        video.setId(1);
        video.setTitle("测试");
        videoService.findById(1);
        videoService.save(video);

    }
}
