package com.peng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-20 15:16
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8006.class,args);
  }
}
