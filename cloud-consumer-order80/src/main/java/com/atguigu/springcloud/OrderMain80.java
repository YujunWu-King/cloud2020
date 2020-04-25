package com.atguigu.springcloud;

import com.atguigu.myrulr.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description 类描述<br />
 * @ClassName OrderMain80
 * @Author yujun.wu
 * @DateTime 2020/4/24 15:24
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PROVIDER-SERVICE",configuration = MySelfRule.class)//指定服务和负载均衡规则
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
