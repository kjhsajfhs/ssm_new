package net.xdclass.sp.service;

import net.xdclass.sp.domian.Video;

public interface VideoService {

    int save(Video video);

    Video findById(Integer id);
}
