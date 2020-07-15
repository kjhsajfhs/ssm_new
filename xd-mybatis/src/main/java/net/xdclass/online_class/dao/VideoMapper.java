package net.xdclass.online_class.dao;

import com.sun.org.glassfish.gmbal.ParameterNames;
import net.xdclass.online_class.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

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
    
  /*更新视频*/
    int updateVideo(Video video);

  /*  动态更新视频*/
  int updateVideoSelective(Video video);


  /*根据时间和价格删除*/
  int deleteByCreateTimeAndPrice(Map<String,Object> map);

  Video selectBaseFieldByIdWithResultMap(@Param("video_id") int id);


}
