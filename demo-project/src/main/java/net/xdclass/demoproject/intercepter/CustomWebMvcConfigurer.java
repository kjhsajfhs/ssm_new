package net.xdclass.demoproject.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* @拦截器配置类
 * @ClassName CustomWebMvcConfigurer
 * @Description
 * @Author cy
 * @Date 2020-07-13 15:11
 * Version 1.0
 **/
@Configuration
public class CustomWebMvcConfigurer  implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(getLoginIntercepteor()).addPathPatterns("/api/v1/pri/**");
        registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/api/v1/pri/**");
       WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public LoginIntercepter getLoginIntercepteor(){
        return new LoginIntercepter();
    }
}
