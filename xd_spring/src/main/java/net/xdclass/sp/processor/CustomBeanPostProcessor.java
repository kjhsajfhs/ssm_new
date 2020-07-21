package net.xdclass.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/* @
 * @ClassName CustomBeanPostProcessor
 * @Description
 * @Author cy
 * @Date 2020-07-17 14:37
 * Version 1.0
 **/
public class CustomBeanPostProcessor  implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor postProcessBeforeInitialization beanName="+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor postProcessAfterInitialization beanName="+beanName);
        return bean;
    }
}
