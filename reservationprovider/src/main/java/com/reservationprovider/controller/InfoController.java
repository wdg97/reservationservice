package com.reservationprovider.controller;

import com.reservationaip.pojo.User;
import com.reservationaip.service.IDubboInfoService;
import com.reservationaip.service.IDubboUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Date 2022/3/7 15:07
 * @Author wdg
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    /**
     * 在消费者里面 使用stub的指定类,执行存根处理就是在调用真正的方法之前会先执行这个类里面的本方法,一般实现参数的判断什么的
     */
    @DubboReference(stub = "com.reservationprovider.comment.InfoServiceLocal")
    private IDubboInfoService infoService;

    @Value(value = "${test.wdg.name}")
    private String testName;

    @GetMapping("/getUserInfo")
    public User getUserInfo() {
        return infoService.getUserInfo();
    }

    @GetMapping("/getName")
    public String getName(){
        return testName;
    }

}
