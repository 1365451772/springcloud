package com.peng.springcloud;

import com.peng.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-09 15:00
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
public class OrderMain80 {

  public static void main(String[] args) {
    SpringApplication.run(OrderMain80.class,args);
  }
}
