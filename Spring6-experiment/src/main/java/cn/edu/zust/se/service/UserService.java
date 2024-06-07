package cn.edu.zust.se.service;

import cn.edu.zust.se.mapper.UserMapper;
import cn.edu.zust.se.model.vo.UserVo;
import cn.edu.zust.se.util.MybatisUtil;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author ShiHaoHu
 * @since 2024/6/6 00:22
 * @description
 */
public class UserService {

    public boolean login(UserVo user){
        System.out.println(JSON.toJSONString(user));
        return true;
    }

    public UserVo getUser(String userName) {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserVo u = userMapper.getUser(userName);
        sqlSession.close();
        return u;
    }

    public void register(UserVo u) {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //System.out.println("userService" + u);
        userMapper.register(u);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<UserVo> listUsers() {
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserVo> userVos = userMapper.listUsers();
        sqlSession.commit();
        sqlSession.close();
        return userVos;
    }
}
