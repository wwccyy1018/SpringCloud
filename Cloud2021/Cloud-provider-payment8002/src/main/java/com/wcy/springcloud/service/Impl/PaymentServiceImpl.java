package com.wcy.springcloud.service.Impl;

import com.wcy.springcloud.dao.PaymentMapper;
import com.wcy.springcloud.pojo.Payment;
import com.wcy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 18:21
 * 4
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentMapper.getPaymentById(id);
    }
}
