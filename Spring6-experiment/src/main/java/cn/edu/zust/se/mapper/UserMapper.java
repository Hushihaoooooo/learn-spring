package cn.edu.zust.se.mapper;

import cn.edu.zust.se.model.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ShiHaoHu
 * @date 2024/6/5 12:07
 * @description
 */
public interface UserMapper {
    UserVo getUser(@Param("userName") String userName);

    void register(@Param("user") UserVo u);

    List<UserVo> listUsers();
}
