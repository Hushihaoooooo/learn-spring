package com.shihaohu;

import com.shihaohu.mapper.anno.UserMapper;
import com.shihaohu.pojo.Picture;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperAnnoTest {
    //由于注解适用于较为简便的开发，仅拿要求10示例
    @Test
    public void testFindPicturesByTags() throws IOException {
        //加载核心配置文件，获取SqlSessionFactory
        String resource = "mybatis_anno_conf.xml";
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
