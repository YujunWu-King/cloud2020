package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @Description 类描述<br />
 * @ClassName PaymentHystrixMain8001
 * @Author yujun.wu
 * @DateTime 2020/4/26 14:10
 * @Version 1.0
 **/
@SpringBootApplication
@EnableCircuitBreaker
public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}
