package com.debugmyself.springcloud.service;

import com.debugmyself.springcloud.entites.CommonResult;
import com.debugmyself.springcloud.entites.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 功能描述
 *
 * @author wangxq
 * @date 2022年06月12日 19:46
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface IPaymentService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
