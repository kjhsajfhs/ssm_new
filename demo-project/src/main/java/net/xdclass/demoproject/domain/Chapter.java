package net.xdclass.demoproject.domain;

/* @
 * @ClassName Chapter
 * @Description
 * @Author cy
 * @Date 2020-07-09 14:22
 * Version 1.0
 **/
public class Chapter {
    private int id;

    private int videoId;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
