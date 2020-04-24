package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yujun.wu
 * @version 1.0
 * @create date 2020/4/23 23:19
 * @Description:类的具体作用描述
 */
@Data
@AllArgsConstructor//全参
@NoArgsConstructor//空参
public class Payment {
    private Long id;
    private String serial;
}