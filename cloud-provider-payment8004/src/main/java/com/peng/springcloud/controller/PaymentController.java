package com.peng.springcloud.controller;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sp
 * @Description
 * @create 2021-02-20 14:07
 * @Modified By:
 */
@RestController
@Slf4j
public class PaymentController {

  @Value("${server.port}")
  private String serverPort;

  @RequestMapping(value = "/payment/zk")
  public String paymentzk()
  {
    return "springcloud with zookeeper: "+serverPort+"\t"+ UUID.randomUUID().toString();
  }
}


