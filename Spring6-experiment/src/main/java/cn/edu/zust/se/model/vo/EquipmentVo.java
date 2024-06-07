package cn.edu.zust.se.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author ShiHaoHu
 * @date 2024/6/7 21:35
 * @description
 */
@Data
public class EquipmentVo {
    private int id;
    private String name;
    private String description;
    private String code;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addTime;
    private float price;
    private String place;
    private int userId;
    private String userName;
}
