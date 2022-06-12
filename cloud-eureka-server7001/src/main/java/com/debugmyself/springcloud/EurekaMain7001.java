package com.debugmyself.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 21:01
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
  public static void main(String[] args) {
      SpringApplication.run(EurekaMain7001.class, args);
  }
}
