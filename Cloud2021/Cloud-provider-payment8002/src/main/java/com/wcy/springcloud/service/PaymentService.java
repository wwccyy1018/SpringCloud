package com.wcy.springcloud.service;

import com.wcy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 18:18
 * 4
 */
public interface PaymentService {
    /**插入*/
    int create(Payment payment);
    /**根据id查询*/
    Payment getPaymentById(@Param("id") Integer id);
}
