package com.reservationconsumer.controller;

import com.reservationaip.pojo.User;
import com.reservationaip.service.IDubboUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;
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
    /**
     * 负载均衡是随机的
     */
    @DubboReference(loadbalance = RandomLoadBalance.NAME)
    private IDubboUserService dubboUserService;

    @GetMapping("/qryAllUser")
    public List<User> qryAllUser() {
        return dubboUserService.qryAllUser();
    }
}
