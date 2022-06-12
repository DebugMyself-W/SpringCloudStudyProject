package com.debugmyself.springcloud.dao;

import com.debugmyself.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 14:27
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
