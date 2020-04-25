package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @Description 类描述<br                                                               />
 * @ClassName PaymentController
 * @Author yujun.wu
 * @DateTime 2020/4/24 11:22
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入数据库成功返回值{}，插入ID{}", result,payment.getId());

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:"+serverPort, result);
        } else {
            return new CommonResult(200, "");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200, "查询数据成功,serverPort:"+serverPort, payment);
        } else {
            return new CommonResult(444, "查询数据失败,查询ID:" + id);
        }
    }
    @GetMapping(value = "/payment/discovery")
    public Object getDiscoveryClient(){
        List<String> services = discoveryClient.getServices();
        for (String server:services) {
            log.info("server:{}",server);
            List<ServiceInstance> instances = discoveryClient.getInstances(server);
            for (ServiceInstance instance: instances) {
                log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
            }
        }
        return discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getServerPort(){
        return serverPort;
    }
}
