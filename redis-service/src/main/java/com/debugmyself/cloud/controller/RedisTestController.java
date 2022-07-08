package com.debugmyself.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author wangxq
 * @date 2022年07月07日 21:32
 */
@RestController
@RequestMapping("/redisTest")
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis() {
        //设置值到redis
        redisTemplate.opsForValue().set("name","lucy");
        //从redis获取值
        String name = (String)redisTemplate.opsForValue().get("name");
        return name;
    }



    @GetMapping("/secondsKill")
    public String secondsKill(@RequestParam("prodid") String prodid,@RequestParam("userid") String userid) {

        //判断用户，商品是否存在
        String productId = "sk:"+prodid+":qt";
        String userKey = "sk:"+prodid+":user";
        //判断秒杀是否开始
        if(redisTemplate.opsForValue().get(productId)==null){
            return "秒杀未开始";
        }
        //根据库存是否小于0是否结束
        if((Integer)redisTemplate.opsForValue().get(productId)<=0){
            return "秒杀结束";
        }
        //判断用户是否已经秒杀过
        if(redisTemplate.opsForSet().isMember(userKey,userid)){
            return "你已经秒杀过了";
        }

        //秒杀过程
        //1.设置库存减1
        redisTemplate.opsForValue().decrement(productId);
        //2.用户秒杀记录
        redisTemplate.opsForSet().add(userKey,userid);
        return "true";
    }
}
