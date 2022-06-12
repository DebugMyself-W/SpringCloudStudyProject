package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述
 * @EnableEurekaClient 启动Eureka客户端
 *  @EnableDiscoveryClient 启用服务发现
 * @author: wangxq
 * @date: 2022年06月09日 11:08
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8001.class, args);
  }
}
