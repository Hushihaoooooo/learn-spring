package com.shihaohu.pojo;

import java.util.Date;

public class Picture {
    private Integer id;
    private String name;
    private String fName;
    private Integer userId;
    private String intro;
    private String tags;
    private Date uploadTime;
    private Integer clickNum;

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", userId=" + userId +
                ", intro='" + intro + '\'' +
                ", tags='" + tags + '\'' +
                ", uploadTime=" + uploadTime +
                ", clickNum=" + clickNum +
                '}';
    }
}
