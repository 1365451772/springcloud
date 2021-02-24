package com.peng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-24 15:39
 * @Modified By:
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355
{
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientMain3355.class, args);
  }
}
