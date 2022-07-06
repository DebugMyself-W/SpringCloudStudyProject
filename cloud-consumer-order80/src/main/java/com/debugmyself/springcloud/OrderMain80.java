package com.debugmyself.springcloud;

import com.debugmyself.myrule.config.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 17:25
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service", configuration = MyRuleConfig.class)
public class OrderMain80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderMain80.class, args);
  }
}
