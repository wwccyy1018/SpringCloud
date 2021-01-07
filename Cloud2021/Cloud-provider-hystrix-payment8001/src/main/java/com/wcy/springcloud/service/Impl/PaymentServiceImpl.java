package com.wcy.springcloud.service.Impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.wcy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/4 11:55
 * 4
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfo_Ok(Integer id) {
        return "线程池"+Thread.currentThread().getName()+"paymentInfo_Ok："+id+"啊哈哈";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")//此方法返回时间超过3秒,降级操作
    })
    public String paymentInfo_TimeOut(Integer id) {
        //int i=5/0;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"paymentInfo_TimeOut："+id+"耗时3秒钟";
    }


    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池"+Thread.currentThread().getName()+"8001程序等待时间过程或出错";
    }

    //==============服务熔断
    @Override
    @HystrixCommand(fallbackMethod = "paymetCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率
            //总结 在10秒钟内10次请求失败率为百分之60 直接熔断
    })
    public String paymetCircuitBreaker(Integer id){
        if (id<0){
            throw new RuntimeException("不能为负数异常");
        }
        String s = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"调用成功,流水号："+s;
    }
    //降级方法
    public String paymetCircuitBreaker_fallback(Integer id){
        return "ID 不能为负数,请稍后再试···············";
    }
}
