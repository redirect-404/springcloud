package com.cloud.yy.service;

import com.cloud.yy.pojo.Payment;

public interface PaymentService {

    public Payment getPaymentById(Long id);

    public int addPayment(Payment payment);
}
