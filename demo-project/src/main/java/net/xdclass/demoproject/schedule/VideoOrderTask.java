package net.xdclass.demoproject.schedule;


import org.springframework.stereotype.Component;

/*定时统计订单，金额*/
@Component
public class VideoOrderTask {


/*    //每2秒执行一次
    @Scheduled(fixedRate = 2000)
    public void sum(){
        //正常的是从数据库中查询
        System.out.println(LocalDateTime.now()+" 当前交易额="+Math.random());
        try{
            Thread.sleep(4000L);
        }catch (Exception e){

        }
    }*/

//   @Scheduled(cron = "*/1 * * * * *")
//    public void count(){
//       System.out.println(LocalDateTime.now()+" 当前交易额="+Math.random());
//    }

}
