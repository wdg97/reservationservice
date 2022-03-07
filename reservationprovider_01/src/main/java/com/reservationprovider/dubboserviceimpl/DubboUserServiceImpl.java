package com.reservationprovider.dubboserviceimpl;

import com.reservationaip.pojo.User;
import com.reservationaip.service.IDubboUserService;
import com.reservationprovider.dao.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Date 2022/3/1 17:10
 * @Author wdg
 */
@DubboService
public class DubboUserServiceImpl implements IDubboUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> qryAllUser() {
        System.out.println("服务器2...........");
        return userMapper.qryAllUser();
    }
}
