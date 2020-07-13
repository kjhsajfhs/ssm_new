package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.utils.JsonData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @
 * @ClassName VideoOrderController
 * @Description
 * @Author cy
 * @Date 2020-07-13 08:58
 * Version 1.0
 **/
@RestController
@RequestMapping("api/v1/pri/order")
public class VideoOrderController {

    @RequestMapping("save")
    public JsonData saveOrder(){
        return JsonData.buildSuccess("下单成功");
    }





}
