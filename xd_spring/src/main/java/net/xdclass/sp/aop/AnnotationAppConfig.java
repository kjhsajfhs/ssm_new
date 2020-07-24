package net.xdclass.sp.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/* @
 * @ClassName AnnotationAppConfig
 * @Description
 * @Author cy
 * @Date 2020-07-24 15:17
 * Version 1.0
 **/
@Configuration
@ComponentScan("net.xdclass")
@EnableAspectJAutoProxy//开启了Spring对aspect的支持
public class AnnotationAppConfig {
}
