package com.chenjianwen.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign基于接口来实现消费服务的
 */

@FeignClient(value="eureka-provider")
//这里FeignClient注解是生产者服务的名称,即为application.xml文件中的spring.application.name
public interface FeignClientService {

    @RequestMapping(value="/eureka-provider/provider")
    //这里mapping映射的是生产者具体服务的地址，其中"/eureka-provider"是上下文路径context-path，"/provider"是服务映射
    String invokeService();
}
