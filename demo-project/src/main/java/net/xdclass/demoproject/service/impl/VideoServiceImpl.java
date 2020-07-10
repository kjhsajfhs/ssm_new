package net.xdclass.demoproject.service.impl;

import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.mapper.VideoMapper;
import net.xdclass.demoproject.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @
 * @ClassName VideoServiceImpl
 * @Description
 * @Author cy
 * @Date 2020-07-09 10:33
 * Version 1.0
 **/
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}
