package com.cloud.yy.controller;

import com.cloud.yy.pojo.CommentResult;
import com.cloud.yy.pojo.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class CustomerConller {

    @Resource
    private RestTemplate restTemplate;

    private String PAYMENT_URL = "http://localhost:8001";

    @GetMapping("/customer/addPayemnt")
    public CommentResult<Payment> addPayemnt(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/addPayment",payment,CommentResult.class);
    }


    @GetMapping("/customer/getPayment/{id}")
    public CommentResult<Payment> getPayemnt(@PathVariable("id") Long id){
        System.out.println(id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPayment/"+id,CommentResult.class);
    }

}
