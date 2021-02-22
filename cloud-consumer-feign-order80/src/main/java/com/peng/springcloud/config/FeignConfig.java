package com.peng.springcloud.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author sp
 * @Description
 * @create 2021-02-22 14:15
 * @Modified By:
 */
@Configuration
public class FeignConfig {

  @Bean
  Logger.Level feignLoggerLevel() {
    return Level.FULL;
  }

}
