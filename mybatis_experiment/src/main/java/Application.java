import com.alibaba.fastjson.JSON;
import com.shihaohu.mapper.anno.UserMapper;
import com.shihaohu.pojo.Picture;
import com.shihaohu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author ShiHaoHu
 * @date 2024/4/29 18:55
 * @description
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper usermapper = ac.getBean(UserMapper.class);
        List<Picture> picturesByTags = usermapper.findPicturesByTags("cat, animal");
        System.out.println(picturesByTags);
    }
}
