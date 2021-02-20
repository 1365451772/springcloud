package com.peng.springcloud.controller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author sp
 * @Description
 * @create 2021-02-20 15:17
 * @Modified By:
 */
public class PaymentController {
  @Value("${server.port}")
  private String serverPort;

  @RequestMapping(value = "/payment/consul")
  public String paymentConsul()
  {
    return "springcloud with consul: "+serverPort+"\t   "+ UUID.randomUUID().toString();
  }
}
