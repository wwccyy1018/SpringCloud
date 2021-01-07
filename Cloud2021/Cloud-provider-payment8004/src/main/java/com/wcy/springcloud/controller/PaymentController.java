package com.wcy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/2 22:18
 * 4
 */
@RestController
@RequestMapping("/")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/paymentzk/zk")
    public String paymentzk(){
        return "springcloud zookeeper"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
