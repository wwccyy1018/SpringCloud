package com.wcy.springcloud.service.Impl;

import com.wcy.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/6 14:53
 * 4
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "paymentInfo_Ok异常~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut异常~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }
}
