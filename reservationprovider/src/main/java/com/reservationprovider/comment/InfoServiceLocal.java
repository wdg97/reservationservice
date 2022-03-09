package com.reservationprovider.comment;

import com.reservationaip.pojo.User;
import com.reservationaip.service.IDubboInfoService;
import org.springframework.util.Assert;

/**
 * @Description
 * @Date 2022/3/7 16:31
 * @Author wdg
 */
public class InfoServiceLocal implements IDubboInfoService {
    private IDubboInfoService dubboInfoService;

    public InfoServiceLocal(IDubboInfoService infoService) {
        this.dubboInfoService = infoService;
        System.out.println("执行本地的代理信息。。。。。。。。。。");
    }

    @Override
    public User getUserInfo() {
        System.out.println("执行存根方法。。。。");
        if (dubboInfoService.getUserInfo() == null){
            User user = new User();
            user.setName("空");
            return user;
        }else {
            return dubboInfoService.getUserInfo();
        }

    }
}
