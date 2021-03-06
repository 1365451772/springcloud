package com.peng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-09 11:26
 * @Modified By:
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8001 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8001.class,args);
  }
}
