package com.shihaohu;

import com.shihaohu.conf.SpringConf;
import com.shihaohu.mapper.UserMapper;
import com.shihaohu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConf.class);
        UserMapper userMapper = ctx.getBean(UserMapper.class);
        List<User> users = userMapper.findAll();
        System.out.println(users);
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        InputStream in = Resources.getResourceAsStream("MybatisConf.xml.bak");
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = userMapper.findAll();
//        System.out.println(users);
    }
}
