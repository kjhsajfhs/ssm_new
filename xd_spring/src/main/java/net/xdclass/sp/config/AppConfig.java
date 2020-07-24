package net.xdclass.sp.config;

import net.xdclass.sp.domian.VideoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/* @
 * @ClassName AppConfig
 * @Description
 * @Author cy
 * @Date 2020-07-23 16:04
 * Version 1.0
 **/
@Configuration
public class AppConfig {


    @Bean(name = "videoOrderName",initMethod = "init",destroyMethod = "destory")
    @Scope
    public VideoOrder videoOrder(){
        return new VideoOrder();
    }
}
