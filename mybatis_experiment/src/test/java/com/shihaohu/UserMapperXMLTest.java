package com.shihaohu;

import com.shihaohu.mapper.xml.UserMapper;
import com.shihaohu.pojo.Picture;
import com.shihaohu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.List;

public class UserMapperXMLTest {
    @Test
    public void testGetBigv() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = usermapper.getBigv();
        System.out.println(users);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testGetUserPictures() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<Picture> userPictures = usermapper.getUserPictures(1, 0, 1);
        System.out.println(userPictures);

        Timestamp timestamp1 = Timestamp.valueOf("2023-04-25 10:15:30");
        Timestamp timestamp2 = Timestamp.valueOf("2025-04-26 08:30:45");

        List<Picture> userPictures2 = usermapper.getUserPictures2(1, timestamp1, timestamp2, 0, 1);
        System.out.println(userPictures2);

        //释放资源
        sqlSession.close();
    }

    @Test
    public void testGetFollows() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> follows = usermapper.getFollows(1);
        System.out.println(follows);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testGetFollowPictures() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<Picture> followPictures = usermapper.getFollowPictures(1, 0, 2);
        System.out.println(followPictures);

        Timestamp timestamp1 = Timestamp.valueOf("2023-04-25 10:15:30");
        Timestamp timestamp2 = Timestamp.valueOf("2025-04-26 08:30:45");

        List<Picture> followPictures2 = usermapper.getFollowPictures2(1, timestamp1, timestamp2, 0, 2);
        System.out.println(followPictures2);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testGetRecentPictures() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<Picture> recentPictures = usermapper.getRecentPictures(0, 3);
        System.out.println(recentPictures);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testFindUsersByName() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<User> usersByName = usermapper.findUsersByName("%1%");
        System.out.println(usersByName);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testFindPicturesByName() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<Picture> picturesByName = usermapper.findPicturesByName("%1%");
        System.out.println(picturesByName);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void testFindPicturesByTags() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_xml_conf.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象，用于执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper usermapper = sqlSession.getMapper(UserMapper.class);
        List<Picture> picturesByTags = usermapper.findPicturesByTags("cat, animal");
        System.out.println(picturesByTags);
        //释放资源
        sqlSession.close();
    }






}
