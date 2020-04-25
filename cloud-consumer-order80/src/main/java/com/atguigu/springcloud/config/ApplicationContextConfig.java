package com.atguigu.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集，实现80到8001的远程调用。
 * 官网地址：https://docs.spring.io/spring-framework/docs/5.2.2.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html
 * 使用restTemplate访问restful接口非常的简单粗暴，（url、requestMap、ResponseBean.class）这三个参数分别代表REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
 <br />
 * @ClassName ApplicationContextConfig
 * @Author yujun.wu
 * @DateTime 2020/4/24 15:31
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced//使用注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

