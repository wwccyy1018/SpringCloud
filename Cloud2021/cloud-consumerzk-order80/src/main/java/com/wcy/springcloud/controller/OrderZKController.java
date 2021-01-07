package com.wcy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/3 11:40
 * 4
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderZKController {

    public static final String INVPKE_URL="http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVPKE_URL+"/paymentzk/zk",String.class);
    }
}
