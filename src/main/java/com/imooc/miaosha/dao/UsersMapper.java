package com.imooc.miaosha.dao;

import com.imooc.miaosha.domain.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by lwx on 2019/8/16.
 */
@Mapper
public interface UsersMapper {
    Users getUser(Integer id);
}
