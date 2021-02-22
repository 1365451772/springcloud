package com.peng.springcloud.service;

import com.peng.springcloud.entities.CommonResult;
import com.peng.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author sp
 * @Description
 * @create 2021-02-22 10:38
 * @Modified By:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping(value = "/payment/feign/timeout")
  public String paymentFeignTimeout();
}
