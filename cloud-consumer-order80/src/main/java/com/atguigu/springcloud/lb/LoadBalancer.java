package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yujun.wu
 * @version 1.0
 * @create date 2020/4/25 16:55
 * @Description:类的具体作用描述
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
