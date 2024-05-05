package se.zust.edu.cn.service.impl;

import se.zust.edu.cn.bean.Message;
import se.zust.edu.cn.service.MessageService;

public class SMSMessageServiceImpl implements MessageService {
    private String signName;
    private String templateCode;
    private String templateParam;

    public SMSMessageServiceImpl(String signName, String templateCode, String templateParam) {
        this.signName = signName;
        this.templateCode = templateCode;
        this.templateParam = templateParam;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public String getTemplateParam() {
        return templateParam;
    }

    public void setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
    }

    @Override
    public boolean sendMessage(Message message) {
        System.out.println("SMS: " + message.toString());
        return true;
    }

    public void SMSMessageServiceImpl(String sign, String code, String param) {

    }
}
