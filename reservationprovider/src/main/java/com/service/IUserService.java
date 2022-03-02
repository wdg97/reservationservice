package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.User;

import java.util.List;

/**
 * @Description
 * @Date 2022/3/1 17:26
 * @Author wdg
 */
public interface IUserService extends IService<User> {
    List<User> qryAllUser();
}
