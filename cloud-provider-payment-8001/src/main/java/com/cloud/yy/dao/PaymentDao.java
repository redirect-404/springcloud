package com.cloud.yy.dao;

import com.cloud.yy.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int addPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
