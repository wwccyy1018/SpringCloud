package com.wcy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 23:57
 */
@SpringBootApplication
/**表示为Eureka注册中心*/
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
