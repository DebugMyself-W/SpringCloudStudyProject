package com.debugmyslef.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述
 *@EnableDiscoveryClient//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 * @author: wangxq
 * @date: 2022年06月10日 17:18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8004.class,args);
  }
}
