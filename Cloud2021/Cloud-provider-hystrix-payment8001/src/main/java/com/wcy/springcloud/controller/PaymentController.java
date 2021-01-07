package com.wcy.springcloud.controller;

import com.wcy.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/4 14:19
 * 4
 */
@RestController
@RequestMapping("/hystrix")
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_Ok(id);
    }
    @GetMapping("/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        return paymentService.paymentInfo_TimeOut(id);
    }
    //服务熔断
    @GetMapping("/paymetCircuitBreaker/{id}")
    public String paymetCircuitBreaker(@PathVariable("id") Integer id){
        return paymentService.paymetCircuitBreaker(id);
    }
}
