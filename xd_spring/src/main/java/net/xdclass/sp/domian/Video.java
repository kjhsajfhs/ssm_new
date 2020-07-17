package net.xdclass.sp.domian;

/* @
 * @ClassName Video
 * @Description
 * @Author cy
 * @Date 2020-07-16 11:57
 * Version 1.0
 **/
public class Video {

    private int id;

    private String title;

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
