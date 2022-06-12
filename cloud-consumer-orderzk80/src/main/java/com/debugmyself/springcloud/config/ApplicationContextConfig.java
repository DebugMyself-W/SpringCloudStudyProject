package com.debugmyself.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月10日 18:09
 */
@Configuration
public class ApplicationContextConfig {

    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
