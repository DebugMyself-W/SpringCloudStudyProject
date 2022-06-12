package com.debugmyself.springcloud.controller;

import com.debugmyself.springcloud.entites.CommonResult;
import com.debugmyself.springcloud.entites.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 17:30
 */
@RestController
public class OrderConrtroller {

    //public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){

        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id, CommonResult.class);
    }
    @GetMapping("/consumer/payment/get4Entity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
        return restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id, CommonResult.class).getBody();
    }
}
