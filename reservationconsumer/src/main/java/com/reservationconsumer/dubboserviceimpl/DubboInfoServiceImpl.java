package com.reservationconsumer.dubboserviceimpl;

import com.reservationaip.pojo.User;
import com.reservationaip.service.IDubboInfoService;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @Description
 * @Date 2022/3/7 15:03
 * @Author wdg
 */
@DubboService
public class DubboInfoServiceImpl implements IDubboInfoService {
    @Override
    public User getUserInfo() {

        User user = new User();
        user.setId(99);
        user.setName("wddd");

        return user;
    }
}
