package com.shihaohu.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author ShiHaoHu
 * @date 2024/5/9 19:51
 * @description
 */
@Configuration
/* 细化书写 */
//@ComponentScan({"com.shihaohu.mapper", "com.shihaohu.service", "com.shihaohu.controller"})
/* 用筛子筛掉@Controller的类 */
@ComponentScan(value = "com.shihaohu", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
public class SpringConfig {

}
