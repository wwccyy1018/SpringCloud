package com.wcy.springcloud.service;


import com.wcy.springcloud.service.Impl.PaymentHystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/4 23:37
 * 4
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentHystrixServiceImpl.class)
public interface PaymentHystrixService {
    @GetMapping("/hystrix/ok/{id}")
    String paymentInfo_Ok(@PathVariable("id") Integer id);
    @GetMapping("/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
