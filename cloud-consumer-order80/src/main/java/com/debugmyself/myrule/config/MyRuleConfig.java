package com.debugmyself.myrule.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月11日 21:09
 */
@Configuration
public class myRuleConfig {


    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
