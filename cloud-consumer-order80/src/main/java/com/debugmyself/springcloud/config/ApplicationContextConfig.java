package com.debugmyself.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 17:31
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 功能描述:
     *使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
     * @param:
     * @return:
     * @auther: wangxq
     * @date: 2022/6/11
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
