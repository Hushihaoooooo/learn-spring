package com.shihaohu;

import com.shihaohu.conf.SpringConfig;
import com.shihaohu.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ShiHaoHu
 * @date 2024/5/9 19:55
 * @description
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController bean = ctx.getBean(UserController.class);
        System.out.println(bean);
    }
}
