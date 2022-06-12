package com.debugmyself.springcloud.service.impl;

import com.debugmyself.springcloud.dao.PaymentDao;
import com.debugmyself.springcloud.entites.Payment;
import com.debugmyself.springcloud.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author: wangxq
 * @date: 2022年06月09日 14:36
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment) {
    return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
