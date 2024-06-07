package com.shihaohu.pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String userName;
    private String password;
    private String name;
    private String intro;
    private String gender;
    private String province;
    private String city;
    private Date registTime;
    private String type;
    private String email;
    private String mobile;
    private String QQ;
    private String status;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                ", gender='" + gender + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", registTime=" + registTime +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", QQ='" + QQ + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
