package com.reservationprovider.controller;

import com.reservationaip.pojo.User;
import com.reservationaip.service.IDubboInfoService;
import com.reservationaip.service.IDubboUserService;
import org.apache.dubbo.config.annotation.DubboReference;
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
@RequestMapping("/user")
public class UserController {
    @DubboReference
    private IDubboInfoService infoService;

    @GetMapping("/qryAllUser")
    public User qryAllUser() {
        return infoService.getUserInfo();
    }

}
