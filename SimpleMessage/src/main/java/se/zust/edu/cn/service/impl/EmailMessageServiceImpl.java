package se.zust.edu.cn.service.impl;

import se.zust.edu.cn.bean.Message;
import se.zust.edu.cn.service.MessageService;

public class EmailMessageServiceImpl implements MessageService {
    private String smtp;
    private String userName;
    private String password;

    public EmailMessageServiceImpl(String smtp, String userName, String password) {
        this.smtp = smtp;
        this.userName = userName;
        this.password = password;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void EmailMessageServiceImpl(String smtp, String name, String pwt) {

    }

    @Override
    public boolean sendMessage(Message message) {
        System.out.println("Email: " + message.toString());
        return true;
    }
}
