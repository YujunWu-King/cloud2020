package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description https://blog.csdn.net/qq_41211642/article/details/104851537<br />
 * @ClassName FeignConfig
 * @Author yujun.wu
 * @DateTime 2020/4/26 13:27
 * @Version 1.0
 **/
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}