package com.atguigu.myrulr;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author yujun.wu
 * @version 1.0
 * @create date 2020/4/25 16:09
 * @Description:类的具体作用描述
 */
@Configuration
public class MySelfRule{
    @Bean
    public IRule getIRule(){
        return new RandomRule();//定义随机
    }

}
