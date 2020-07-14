package net.xdclass.online_class.dao;

import com.sun.org.glassfish.gmbal.ParameterNames;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper {

    /**
     *根据视频id 查找视频对象
     *
     */
    Video selectById(@Param("video_id") int videoId);

/*    查询全部视频列表*/
    @Select("select * from video")
    List<Video> selectList();

    /*根据评分和标题模糊查询*/
    List<Video> selectByPointAndTitleLike(@Param("point") double point,@Param("title") String title);

    /*新增一条视频*/
    int add(Video video);

    /*批量插入*/
    int addBatch(List<Video> list);
}
