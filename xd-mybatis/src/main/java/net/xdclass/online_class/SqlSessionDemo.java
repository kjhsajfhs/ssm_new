package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.dao.VideoOrderMapper;
import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.Video;
import net.xdclass.online_class.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* @
 * @ClassName SqlSessionDemo
 * @Description
 * @Author cy
 * @Date 2020-07-14 10:50
 * Version 1.0
 **/
public class SqlSessionDemo {
    public static void main(String[] args) throws IOException {
        String resouce="config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
        try (SqlSession sqlSession=sqlSessionFactory.openSession()){
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
   /*         Video video = videoMapper.selectById(44);
            List<Video> videos = videoMapper.selectList();
            System.out.println(video.toString());
            System.out.println(videos.toString());*/

      /*      List<Video> videoList = videoMapper.selectByPointAndTitleLike(8.7, "HTML");
            System.out.println(videoList.toString());*/

      /*      Video video = new Video();
            video.setTitle("小滴课堂面试");
            video.setCoverImg("xdclass.net/bbb.png");
            video.setPoint(9.4);
            video.setCreateTime(new Date());
            video.setPrice(9999);
            video.setSummary("新增一条记录");


            Video video2 = new Video();
            video2.setTitle("小滴课堂面试");
            video2.setCoverImg("xdclass.net/bbb.png");
            video2.setPoint(9.4);
            video2.setCreateTime(new Date());
            video2.setPrice(9999);
            video2.setSummary("新增一条记录");
            List<Video> list = new ArrayList<>();
            list.add(video);
            list.add(video2);
             videoMapper.addBatch(list);

            System.out.println(video.toString());*/


/*
            Video video = new Video();
            video.setId(51);
            video.setTitle("小弟课堂修改测试");
            video.setCoverImg("xdclass.net/6666.png");

            videoMapper.updateVideoSelective(video);*/


/*            HashMap<String, Object> map = new HashMap<>();
            map.put("createTime","2021-01-11 00:00:00");
            map.put("price",88);
            videoMapper.deleteByCreateTimeAndPrice(map);*/

/*            Video video = videoMapper.selectBaseFieldByIdWithResultMap(40);
            System.out.println(video.toString());*/

            //resultMap association关联查询
/*            List<VideoOrder> videoOrders = videoOrderMapper.queryVideoOrderList();
            for (VideoOrder videoOrder:videoOrders){
                System.out.println(videoOrder.getUser().getName());
            }*/


            List<User> userList = videoOrderMapper.queryUserOrder();
            System.out.println(userList.toString());
        }

    }

}
