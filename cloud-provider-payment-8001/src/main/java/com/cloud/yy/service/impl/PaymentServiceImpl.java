package com.cloud.yy.service.impl;

import com.cloud.yy.dao.PaymentDao;
import com.cloud.yy.pojo.Payment;
import com.cloud.yy.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public Payment getPaymentById(Long id) {
        System.out.println(paymentDao);
        return paymentDao.getPaymentById(id);
    }

    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }
}
