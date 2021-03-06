package com.debugmyself.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月10日 18:08
 */
@RestController
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String getOrder() {
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
    }
}
