package com.wcy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/2 15:15
 * 4
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wcy.springcloud.dao")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
