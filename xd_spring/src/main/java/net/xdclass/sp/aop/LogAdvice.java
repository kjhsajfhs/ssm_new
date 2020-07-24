package net.xdclass.sp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/* @
 * @ClassName LogAdvice
 * @Description
 * @Author cy
 * @Date 2020-07-24 15:02
 * Version 1.0
 **/
@Component
//告诉Spring,这是一个切面类，里面可以定义切入点和通知
@Aspect
public class LogAdvice {

    //切入点表达式
    @Pointcut("execution(* net.xdclass.sp.service.impl.VideoServiceImpl.*(..))")
    public void aspect(){
    }

    //前置通知
    @Before("aspect()")
    public void beforeLog(JoinPoint joinPoint){
        System.out.println("LogAdvice beforeLog");
    }

    //后置通知
    @After("aspect()")
    public void afterLog(JoinPoint joinPoint){
        System.out.println("LogAdvice afterLog");
    }

    //环绕通知
    @Around("aspect()")
    public Object aroud(JoinPoint joinPoint){
        Object target = joinPoint.getTarget().getClass().getName();
        System.out.println("调用者："+target);
        //通过joinPoint获取参数
        Object[] args = joinPoint.getArgs();
        System.out.println("参数="+args[0]);


        long start = System.currentTimeMillis();
        System.out.println("环绕通知 环绕前#############");
        Object result =null;

        //执行连接点的方法
        try {
            result = ((ProceedingJoinPoint) joinPoint).proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("环绕通知 环绕后###################");

        System.out.println("调用方法总耗时 time= "+(end-start)+"ms");
        return result;

    }



}
