package com.wcy.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wcy.springcloud.service.PaymentHystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/4 23:38
 * 4
 */
@RequestMapping("/PaymentHystrix")
@RestController
@DefaultProperties(defaultFallback = "payment_Globlal_FallbackMethod")
public class PaymentHystrixController {
    @Resource
    public PaymentHystrixService paymentHystrixService;

    @GetMapping("/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_Ok(id);
    }

    @GetMapping("/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")//此方法返回时间超过1.5秒,降级操作
//    })
    @HystrixCommand
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_TimeOut(id);
    }

    public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id){
        return "我是80消费,对方支付服务繁忙或出错请稍后重试";
    }

    public String payment_Globlal_FallbackMethod(){
        return "Globlal异常信息·······~~~~~~~~~~~~~";
    }
}
