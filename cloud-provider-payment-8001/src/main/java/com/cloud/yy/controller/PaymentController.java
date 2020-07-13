package com.cloud.yy.controller;

import com.cloud.yy.pojo.CommentResult;
import com.cloud.yy.pojo.Payment;
import com.cloud.yy.service.PaymentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
public class PaymentController {
    Logger log = LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService paymentService;

    @RequestMapping("/payment/addPayment")
    public CommentResult addPayment(@RequestBody Payment payment){
        log.info(""+payment);
        int result = paymentService.addPayment(payment);
        if(result!=0){
            return new CommentResult(200,"成功",result);

        }else{
            return new CommentResult(404,"失败",result);
        }

    }


    @GetMapping("/payment/getPayment/{id}")
    public CommentResult getPayment(@PathVariable Long id){
        log.info(""+id);
        Payment payment = paymentService.getPaymentById(id);
        log.info(""+payment);
        if(payment!=null){
            return new CommentResult(200,"成功",payment);
        }else{
            return new CommentResult(404,"失败",null);
        }

    }
}
