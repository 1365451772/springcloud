package com.peng.springcloud.controller;

import com.peng.springcloud.entities.CommonResult;
import com.peng.springcloud.entities.Payment;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author sp
 * @Description
 * @create 2021-02-09 15:04
 * @Modified By:
 */
@RestController
@Slf4j
public class OrderController {

  public static final String PAYMENT_URL = "http://localhost:8001";
  @Resource
  private RestTemplate restTemplate;


  @GetMapping ("/consumer/payment/create")
  public CommonResult<Payment> create(Payment payment){
    return restTemplate.postForObject(PAYMENT_URL +"/payment/create",payment,CommonResult.class);
  }


  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id)
  {
    return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
  }

}
