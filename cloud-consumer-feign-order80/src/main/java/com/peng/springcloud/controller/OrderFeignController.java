package com.peng.springcloud.controller;

import com.peng.springcloud.service.PaymentFeignService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
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
}
