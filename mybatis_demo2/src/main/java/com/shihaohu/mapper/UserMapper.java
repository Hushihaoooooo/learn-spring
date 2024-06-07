package com.shihaohu.mapper;

import com.shihaohu.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ShiHaoHu
 * @date 2024/5/23 10:12
 * @description
 */
@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
