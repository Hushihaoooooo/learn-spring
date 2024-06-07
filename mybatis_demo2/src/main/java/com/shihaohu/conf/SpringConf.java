package com.shihaohu.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author ShiHaoHu
 * @date 2024/5/23 10:18
 * @description
 */
@Configuration
@ComponentScan("com.shihaohu")
@Import({MybatisConf.class, JdbcConf.class})
@PropertySource("classpath:jdbc.properties")
public class SpringConf {

}
