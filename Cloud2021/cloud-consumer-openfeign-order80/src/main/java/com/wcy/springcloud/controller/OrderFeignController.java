package com.wcy.springcloud.controller;

import com.wcy.springcloud.service.PaymentFeignService;
import com.wcy.springcloud.pojo.Payment;
import com.wcy.springcloud.util.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/4 0:06
 * 4
 */
@RestController
@RequestMapping("/consumer")
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping("/paymentFeignTimeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }
    @GetMapping("/getSleuth")
    public String getSleuth(){
        return paymentFeignService.getSleuth();
    }
}
