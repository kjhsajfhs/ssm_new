package net.xdclass.demoproject.task;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AsyncTask {

/*    @Async
    public  void task1(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task 1");
    }

    @Async
    public  void task2(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task 2");
    }

    @Async
    public  void task3(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task 3");
    }*/

    public Future<String> task4(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task 4");
        return new AsyncResult<String>("任务4");
    }

    public Future<String> task5(){
        try {
            Thread.sleep(4000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task 5");
        return new AsyncResult<String>("任务5");
    }


}
