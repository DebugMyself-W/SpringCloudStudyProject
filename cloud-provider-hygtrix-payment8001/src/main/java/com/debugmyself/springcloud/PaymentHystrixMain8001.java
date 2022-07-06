package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述
 *
 * @author wangxq
 * @date 2022年06月14日 11:32
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 开启断路器
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
    SpringApplication.run(PaymentHystrixMain8001.class, args);
    }
}
