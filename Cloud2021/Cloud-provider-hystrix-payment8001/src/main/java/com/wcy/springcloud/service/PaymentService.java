package com.wcy.springcloud.service;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/4 11:54
 * 4
 */
public interface PaymentService {
    String paymentInfo_Ok(Integer id);
    String paymentInfo_TimeOut(Integer id);
    String paymetCircuitBreaker( Integer id);
}
