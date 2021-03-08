package com.peng.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.peng.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
