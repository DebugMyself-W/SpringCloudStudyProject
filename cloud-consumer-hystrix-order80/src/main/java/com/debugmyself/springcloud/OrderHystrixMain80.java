package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述
 *
 * @author wangxq
 * @date ${YEAR}年${MONTH}月${DAY}日 ${TIME}
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix // 开启断路器
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}