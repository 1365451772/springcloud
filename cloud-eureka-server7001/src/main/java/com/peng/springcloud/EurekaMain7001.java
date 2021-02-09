package com.peng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author sp
 * @Description
 * @create 2021-02-09 16:24
 * @Modified By:
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7001 {

  public static void main(String[] args) {
    SpringApplication.run(EurekaMain7001.class,args);
  }
}
