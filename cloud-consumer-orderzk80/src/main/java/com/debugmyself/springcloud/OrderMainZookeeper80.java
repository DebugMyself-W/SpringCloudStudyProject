package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月10日 18:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainZookeeper80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderMainZookeeper80.class,args);
  }
}
