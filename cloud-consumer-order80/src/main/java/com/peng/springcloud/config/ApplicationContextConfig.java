package com.peng.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author sp
 * @Description
 * @create 2021-02-09 15:11
 * @Modified By:
 */
@Configuration
public class ApplicationContextConfig {
  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }
}
