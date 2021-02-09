package com.peng.springcloud.service.impl;

import com.peng.springcloud.dao.PaymentDao;
import com.peng.springcloud.entities.Payment;
import com.peng.springcloud.service.PaymentService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
