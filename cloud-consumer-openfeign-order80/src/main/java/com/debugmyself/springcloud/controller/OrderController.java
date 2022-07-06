package com.debugmyself.springcloud.controller;

import com.debugmyself.springcloud.entites.CommonResult;
import com.debugmyself.springcloud.entites.Payment;
import com.debugmyself.springcloud.service.IPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author wangxq
 * @date 2022年06月12日 19:46
 */
@RestController
public class OrderController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentService.paymentFeignTimeout();
    }
}
