package com.hsy.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.hsy.springcloud.dao"})
public class MyBatisConfig {
}
