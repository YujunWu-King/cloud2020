package com.atguigu.springcloud.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 类描述<br   />
 * @ClassName PaymentService
 * @Author yujun.wu
 * @DateTime 2020/4/26 14:13
 * @Version 1.0
 **/

public interface PaymentService {

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_Timeout(Integer id);
}
