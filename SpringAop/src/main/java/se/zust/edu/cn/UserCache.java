package se.zust.edu.cn;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class UserCache {
    private String userName;
    private Date loginTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
