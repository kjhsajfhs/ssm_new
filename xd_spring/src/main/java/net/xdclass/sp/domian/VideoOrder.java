package net.xdclass.sp.domian;

/* @
 * @ClassName VideoOrder
 * @Description
 * @Author cy
 * @Date 2020-07-17 11:00
 * Version 1.0
 **/
public class VideoOrder {

    private int id;

    private String outTradeNo;//订单号

    private Video video;

    public VideoOrder() {
        System.out.println("videoOrder构造函数被调用");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", video=" + video +
                '}';
    }

    public void init(){
        System.out.println("VideoOrder init方法被调用");
    }

    public  void destory(){
        System.out.println("videoOrder destory方法被调用");
    }
}
