package com.reservationprovider.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reservationaip.pojo.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdf
 * @since 2022-03-01
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> qryAllUser();
}
