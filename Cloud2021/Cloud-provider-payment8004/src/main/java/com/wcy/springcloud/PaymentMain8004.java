package com.wcy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/2 21:47
 * 4
 */
@SpringBootApplication
/*使用consul或者zookeeper作为注册中心时注册服务*/
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
