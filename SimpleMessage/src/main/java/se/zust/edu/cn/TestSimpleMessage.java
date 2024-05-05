package se.zust.edu.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.zust.edu.cn.bean.Message;
import se.zust.edu.cn.bean.User;
import se.zust.edu.cn.service.MessageService;

public class TestSimpleMessage {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Message msg = (Message) ctx.getBean("message");
        //System.out.println(msg.toString());
        MessageService service = ctx.getBean("emailService", MessageService.class);
        service.sendMessage(msg);
        service = ctx.getBean("smsService", MessageService.class);
        service.sendMessage(msg);
        service = ctx.getBean("wechatService", MessageService.class);
        service.sendMessage(msg);

        User from = new User();
        from.setName("Tom");
        from.setWx("wx0001");
        User to = new User();
        to.setName("Peter");
        to.setWx("wx0002");
        Message message = new Message();
        message.setTopic("消息主题");
        message.setContent("消息内容");
        message.setFrom(from);
        message.setTo(to);
        service.sendMessage(message);
    }
}
