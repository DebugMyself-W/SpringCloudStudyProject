package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 23:18
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
  public static void main(String[] args) {
      SpringApplication.run(EurekaMain7002.class, args);
  }
}
