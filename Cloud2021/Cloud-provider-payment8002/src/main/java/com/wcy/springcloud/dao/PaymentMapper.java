package com.wcy.springcloud.dao;

import com.wcy.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ASUS
 */
public interface PaymentMapper {
    /**插入*/
    int create(Payment payment);
    /**根据id查询*/
    Payment getPaymentById(@Param("id") Integer id);
}