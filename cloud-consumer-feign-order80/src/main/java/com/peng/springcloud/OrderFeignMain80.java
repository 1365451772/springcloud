package com.peng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author sp
 * @Description
 * @create 2021-02-22 10:19
 * @Modified By:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderFeignMain80.class, args);
  }

}
