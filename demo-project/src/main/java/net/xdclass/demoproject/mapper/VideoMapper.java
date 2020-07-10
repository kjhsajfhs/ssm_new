package net.xdclass.demoproject.mapper;

import net.xdclass.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* @
 * @ClassName VideoMapper
 * @Description
 * @Author cy
 * @Date 2020-07-09 10:35
 * Version 1.0
 **/
@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();
    static {
        videoMap.put(1,new Video(1,"java1"));
        videoMap.put(2,new Video(2,"java2"));
        videoMap.put(3,new Video(3,"java3"));
        videoMap.put(4,new Video(4,"java4"));
        videoMap.put(5,new Video(5,"java5"));
    }

    public List<Video>  listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;

    }
}
