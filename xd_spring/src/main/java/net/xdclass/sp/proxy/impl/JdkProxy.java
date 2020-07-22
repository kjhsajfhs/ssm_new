package net.xdclass.sp.proxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* @JDK动态代理
 * @ClassName JdkProxy
 * @Description
 * @Author cy
 * @Date 2020-07-21 14:36
 * Version 1.0
 **/
public class JdkProxy implements InvocationHandler {

    private Object targetObject;


    //新的代理实例
    public Object newProxyInstance(Object targetObject){
        this.targetObject=targetObject;
       return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }


    //invoke==调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         Object result = null;
        try{
            System.out.println("通过JDK动态代理调用"+method.getName()+",打印日志 begin");
            result=method.invoke(targetObject,args);
            System.out.println("通过JDK动态代理调用"+method.getName()+",打印日志 end");
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
