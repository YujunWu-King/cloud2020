package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yujun.wu
 * @version 1.0
 * @create date 2020/4/25 21:17
 * @Description:类的具体作用描述
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        return paymentFeignService.create(payment);
    }


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        //openFeign-ribbon,客户端默认等待一秒
        return paymentFeignService.paymentFeignTimeout();
    }
}
