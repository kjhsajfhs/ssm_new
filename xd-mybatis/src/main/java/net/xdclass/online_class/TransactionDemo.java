package net.xdclass.online_class;


import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/* @
 * @ClassName TransactionDemo
 * @Description
 * @Author cy
 * @Date 2020-07-16 11:06
 * Version 1.0
 **/
public class TransactionDemo {

    public static void main(String[] args) throws IOException {
        String resource="config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //false是自动提交注释
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        //获取Session
        try {
            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
            Video video1 = new Video();
            video1.setTitle("小滴课堂 微服务架构");
            videoMapper.add(video1);
            int i=1/0;
            sqlSession.commit();

        }catch (Exception e){
              e.printStackTrace();
              sqlSession.rollback();
        }
        sqlSession.close();

    }
}
