package se.zust.edu.cn.service.impl;

import se.zust.edu.cn.bean.Message;
import se.zust.edu.cn.service.MessageService;

public class WeChatMessageImpl implements MessageService {
    private String wxKey;
    private String wxSecret;

    public WeChatMessageImpl(String wxKey, String wxSecret) {
        this.wxKey = wxKey;
        this.wxSecret = wxSecret;
    }

    public String getWxKey() {
        return wxKey;
    }

    public void setWxKey(String wxKey) {
        this.wxKey = wxKey;
    }

    public String getWxSecret() {
        return wxSecret;
    }

    public void setWxSecret(String wxSecret) {
        this.wxSecret = wxSecret;
    }

    @Override
    public boolean sendMessage(Message message) {
        System.out.println("WeChat: " + message.toString());
        return true;
    }

    public void WeChatMessageImpl(String key, String secret) {

    }
}
