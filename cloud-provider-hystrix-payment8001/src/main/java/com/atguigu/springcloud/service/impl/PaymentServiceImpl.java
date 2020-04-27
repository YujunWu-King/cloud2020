package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description 类描述<br   />
 * @ClassName PaymentServiceImpl
 * @Author yujun.wu
 * @DateTime 2020/4/26 14:18
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_OK,id：" + id + "\t" + "O(∩_∩)O哈哈~";
    }

    @Override
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            //设置这个线程的超时时间是3s，3s内是正常的业务逻辑，超过3s调用fallbackMethod指定的方法进行处理
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_Timeout(Integer id) {
        int timeNumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池：" + Thread.currentThread().getName() + "   paymentInfo_Timeout,id：" + id + "\t" + "O(∩_∩)O哈哈~" + "   耗时(秒)：" + timeNumber;
    }


    public String paymentInfo_TimeoutHandler(Integer id) {
        return "线程池："+Thread.currentThread().getName()+"   系统繁忙，请稍后再试,id："+id+"\t"+"o(╥﹏╥)o";
    }
}
