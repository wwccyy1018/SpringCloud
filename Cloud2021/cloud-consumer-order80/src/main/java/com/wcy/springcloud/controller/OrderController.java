package com.wcy.springcloud.controller;

import com.wcy.springcloud.pojo.Payment;
import com.wcy.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;


/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 21:33
 * 4
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {
    //public static final String PAYMENT_URL="http://127.0.0.1:8001";
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE"; //集群 默认轮训执行

    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/create")
    public CommonResult<Payment> create(Payment payment){
        System.out.printf(payment+"...............");
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById/"+id,CommonResult.class);
    }
}
