package com.cloud.provider.service;

import com.cloud.provider.pojo.Payment;

public interface PaymentService {

    public Payment getPaymentById(Long id);

    public int addPayment(Payment payment);
}
