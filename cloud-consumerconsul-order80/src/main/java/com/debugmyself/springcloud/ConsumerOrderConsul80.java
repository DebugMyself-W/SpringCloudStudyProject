package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月10日 21:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderConsul80 {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerOrderConsul80.class, args);
  }
}
