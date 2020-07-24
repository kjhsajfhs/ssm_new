package net.xdclass.sp.service.impl;

import net.xdclass.sp.config.CustomConfig;
import net.xdclass.sp.dao.VideoDao;
import net.xdclass.sp.domian.Video;
import net.xdclass.sp.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* @
 * @ClassName VideoServiceImpl
 * @Description
 * @Author cy
 * @Date 2020-07-22 10:32
 * Version 1.0
 **/
@Component("videoService")
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;

    @Autowired
    private CustomConfig customConfig;

    @Override
    public int save(Video video) {
        System.out.println("保存video");
        return 1;
    }

    @Override
    public Video findById(Integer id) {
        System.out.println("根据id查找视频");
        videoDao.test();
        System.out.println(customConfig.getHost());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Video();
    }
}
