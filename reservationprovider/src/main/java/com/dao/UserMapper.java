package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.User;
import org.apache.ibatis.annotations.Mapper;

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
