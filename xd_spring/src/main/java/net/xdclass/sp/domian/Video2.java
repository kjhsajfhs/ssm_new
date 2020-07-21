package net.xdclass.sp.domian;

/* @
 * @ClassName Video
 * @Description
 * @Author cy
 * @Date 2020-07-16 11:57
 * Version 1.0
 **/
public class Video2 {

    private int id;

    private String title;

    private String summary;

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Video2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
