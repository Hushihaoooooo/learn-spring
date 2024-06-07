package com.shihaohu.conf;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author ShiHaoHu
 * @date 2024/5/23 10:23
 * @description
 */
public class MybatisConf {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setTypeAliasesPackage("com.shihaohu.pojo");
        bean.setDataSource(dataSource);

//        // Set MyBatis Configuration properties
//        Properties properties = new Properties();
//        properties.setProperty("mapUnderscoreToCamelCase", "true");
//        bean.setConfigurationProperties(properties);

        return bean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer bean = new MapperScannerConfigurer();
        bean.setBasePackage("com.shihaohu.mapper");
        return bean;
    }


}
