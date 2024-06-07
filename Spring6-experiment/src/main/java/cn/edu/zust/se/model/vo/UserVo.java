package cn.edu.zust.se.model.vo;

import lombok.Data;

/**
 * @author ShiHaoHu
 * @since 2024/6/6 00:20
 * @description
 */
@Data
public class UserVo {
    private int id;
    private String userName;
    private String realName;
    private String password;
    private String address;
    private String mobile;
    private String type;
    private String email;
}
