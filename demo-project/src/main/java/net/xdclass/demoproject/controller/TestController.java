package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WxConfig;
import net.xdclass.demoproject.task.AsyncTask;
import net.xdclass.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* @
 * @ClassName TestController
 * @Description
 * @Author cy
 * @Date 2020-07-10 17:01
 * Version 1.0
 **/
@RestController
@RequestMapping("app/v1/test")
@PropertySource("classpath:pay.properties")
public class TestController {

    @Autowired
    private WxConfig wxConfig;

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("async")
    public JsonData testAsync(){
        long begin = System.currentTimeMillis();
/*        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();*/
        Future<String> task4 = asyncTask.task4();
        Future<String> task5 = asyncTask.task5();
        for(;;){
            if (task4.isDone() && task5.isDone()){
                try {
                    String task4Result = task4.get();
                    System.out.println(task4Result);

                    String task5Result = task5.get();
                    System.out.println(task5Result);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }catch (ExecutionException e){
                    e.printStackTrace();
                }finally {
                    break;
                }

            }
        }

        long end = System.currentTimeMillis();
        return JsonData.buildSuccess(end-begin);
    }



    @GetMapping("list")
    public JsonData testExt(){
        int i = 1/0;
        JsonData jsonData = JsonData.buildSuccess("");
        return jsonData;
    }





    @GetMapping("get_config")
    public JsonData testConfig(){
        System.out.println(12345);
        HashMap<Object, Object> map = new HashMap<>();
        System.out.println(43434);
        map.put("appid",wxConfig.getPayAppid());
        map.put("secret",wxConfig.getPaySecret());
        map.put("mechId",wxConfig.getPayMechId());
        return JsonData.buildSuccess(map);
    }
}
