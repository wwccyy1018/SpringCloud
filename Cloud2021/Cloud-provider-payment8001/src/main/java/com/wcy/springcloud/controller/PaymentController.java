package com.wcy.springcloud.controller;

import com.wcy.springcloud.pojo.Payment;
import com.wcy.springcloud.service.PaymentService;
import com.wcy.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2020/12/28 18:26
 * 4
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果"+result);
        if (result>0){
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(500,"插入失败",null);
        }
    }
    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id){
        log.info("开始查询");
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null){
            return new CommonResult(200,"查询成功 serverPort"+serverPort,payment);
        }else {
            return new CommonResult(500,"查询失败",null);
        }
    }
    @GetMapping("/paymentFeignTimeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
