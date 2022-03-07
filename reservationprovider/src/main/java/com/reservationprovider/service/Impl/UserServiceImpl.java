package com.reservationprovider.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reservationprovider.dao.UserMapper;
import com.reservationaip.pojo.User;
import com.reservationprovider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Date 2022/3/1 17:27
 * @Author wdg
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> qryAllUser() {
      return   userMapper.qryAllUser();
    }
}
