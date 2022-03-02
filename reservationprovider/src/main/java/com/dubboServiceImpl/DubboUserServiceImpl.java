package com.dubboServiceImpl;

import com.dao.UserMapper;
import com.dubbo.service.IDubboUserService;
import com.pojo.User;
import com.service.IUserService;
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
        return userMapper.qryAllUser();
    }
}
