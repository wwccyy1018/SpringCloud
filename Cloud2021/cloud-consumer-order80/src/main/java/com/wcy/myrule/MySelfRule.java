package com.wcy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/3 15:33
 * 4
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();//自定义为随机
    }
}
