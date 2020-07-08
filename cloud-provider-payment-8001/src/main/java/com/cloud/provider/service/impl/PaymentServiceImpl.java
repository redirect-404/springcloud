package com.cloud.provider.service.impl;

import com.cloud.provider.dao.PaymentDao;
import com.cloud.provider.pojo.Payment;
import com.cloud.provider.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
