package com.pemg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-20 14:37
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80
{
  public static void main(String[] args) {
    SpringApplication.run(OrderZKMain80.class, args);
  }
}