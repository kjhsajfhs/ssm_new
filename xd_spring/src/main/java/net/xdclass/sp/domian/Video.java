package net.xdclass.sp.domian;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/* @
 * @ClassName Video
 * @Description
 * @Author cy
 * @Date 2020-07-16 11:57
 * Version 1.0
 **/
@Component
@Scope
public class Video {

    private int id;

    private String title;



    @PostConstruct
    public void   init(){
        System.out.println("vedio init被调用");
    }

    @PreDestroy
    public void destory(){
        System.out.println("video类 destory 方法被调用");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
