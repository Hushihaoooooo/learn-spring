package org.shihaohu;

import org.shihaohu.conf.SpringConf;
import org.shihaohu.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiHaoHu
 * @date 2024/5/4 23:30
 * @description
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConf.class);
        BookDao bookDao1 = ctx.getBean(BookDao.class);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        bookDao1.save();
        System.out.println(bookDao1);
        System.out.println(bookDao2);
        ctx.close();
    }

}
