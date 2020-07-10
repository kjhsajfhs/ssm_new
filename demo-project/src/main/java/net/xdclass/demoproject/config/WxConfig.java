package net.xdclass.demoproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/* @
 * @ClassName WxConfig
 * @Description
 * @Author cy
 * @Date 2020-07-10 17:20
 * Version 1.0
 **/
@Configuration
@PropertySource(value = "classpath:pay.properties")
public class WxConfig {

    @Value("${wxpay.appid}")
    private String payAppid;

    @Value("${wxpay.sercret}")
    private String paySecret;

    @Value("${wx.mechid}")
    private String payMechId;

    public String getPayAppid() {
        return payAppid;
    }

    public void setPayAppid(String payAppid) {
        this.payAppid = payAppid;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    public String getPayMechId() {
        return payMechId;
    }

    public void setPayMechId(String payMechId) {
        this.payMechId = payMechId;
    }
}
