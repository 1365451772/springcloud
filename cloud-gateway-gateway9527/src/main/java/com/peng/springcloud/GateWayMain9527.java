package com.peng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-24 9:58
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527
{
  public static void main(String[] args) {
    SpringApplication.run(GateWayMain9527.class, args);
  }
}
