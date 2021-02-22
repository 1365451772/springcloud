package com.peng.springcloud;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author sp
 * @Description
 * @create 2021-02-22 15:38
 * @Modified By:
 */

@SpringBootApplication
@FeignClient
@Hystrix
public class OrderHystrixMain80 {

  public static void main(String[] args) {
    SpringApplication.run(OrderHystrixMain80.class,args);
  }
}
