package com.wcy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 21:39
 * 4
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //集群
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
