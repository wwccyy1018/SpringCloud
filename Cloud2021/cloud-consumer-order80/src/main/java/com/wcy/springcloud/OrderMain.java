package com.wcy.springcloud;

import com.wcy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 21:28
 * 4
 */
@SpringBootApplication
@EnableEurekaClient
/**自定义负载均衡方式*/
@RibbonClient(value = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class,args);
    }
}
