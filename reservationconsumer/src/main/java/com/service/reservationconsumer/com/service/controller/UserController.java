package com.service.reservationconsumer.com.service.controller;

import com.dubbo.service.IDubboUserService;
import com.pojo.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Date 2022/3/1 17:42
 * @Author wdg
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference
    private IDubboUserService dubboUserService;
    @GetMapping("/qryAllUser")
    public List<User> qryAllUser(){
        return dubboUserService.qryAllUser();
    }
}
