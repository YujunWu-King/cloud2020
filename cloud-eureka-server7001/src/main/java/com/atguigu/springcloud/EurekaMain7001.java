package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 类描述<br               />
 * @ClassName EurekaMain7001
 * @Author yujun.wu
 * @DateTime 2020/4/24 17:12
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer//开启服务注册中心服务
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
