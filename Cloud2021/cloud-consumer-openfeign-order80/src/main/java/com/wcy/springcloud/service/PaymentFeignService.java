package com.wcy.springcloud.service;

import com.wcy.springcloud.pojo.Payment;
import com.wcy.springcloud.util.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/3 23:59
 * 4
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")//微服务名称
public interface PaymentFeignService {
    @GetMapping("/payment/getPaymentById/{id}")//提供服务的功能方法
     CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);
    @GetMapping("/payment/paymentFeignTimeout")
    String paymentFeignTimeout();
    @GetMapping("/payment/getSleuth")
    String getSleuth();
}
