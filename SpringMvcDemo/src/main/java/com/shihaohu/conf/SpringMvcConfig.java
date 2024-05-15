package com.shihaohu.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author ShiHaoHu
 * @date 2024/5/9 10:11
 * @description
 */
@Configuration
@ComponentScan("com.shihaohu.controller")
@EnableWebMvc
public class SpringMvcConfig {

}
