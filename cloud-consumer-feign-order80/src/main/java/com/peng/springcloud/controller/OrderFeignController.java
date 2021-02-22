package com.peng.springcloud.controller;

import com.peng.springcloud.entities.CommonResult;
import com.peng.springcloud.entities.Payment;
import com.peng.springcloud.service.PaymentFeignService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sp
 * @Description
 * @create 2021-02-22 10:53
 * @Modified By:
 */
@Slf4j
@RestController
public class OrderFeignController {
  @Resource
  private PaymentFeignService paymentFeignService;

  @GetMapping(value = "/consumer/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
    return paymentFeignService.getPaymentById(id);
  }

  @GetMapping(value = "/consumer/payment/feign/timeout")
  public String paymentFeignTimeout()
  {
    // OpenFeign客户端一般默认等待1秒钟
    return paymentFeignService.paymentFeignTimeout();
  }


}
