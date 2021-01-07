package com.wcy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/3 11:36
 * 4
 */
@SpringBootApplication
/*使用consul或者zookeeper作为注册中心时注册服务*/
@EnableDiscoveryClient
public class OrderMainZK80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainZK80.class,args);
    }
}
