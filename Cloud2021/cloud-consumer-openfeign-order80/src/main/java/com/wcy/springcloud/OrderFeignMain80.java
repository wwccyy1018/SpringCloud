package com.wcy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/3 23:50
 * 4
 */
@SpringBootApplication
/**使用OpenFeign作为远程调用*/
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
