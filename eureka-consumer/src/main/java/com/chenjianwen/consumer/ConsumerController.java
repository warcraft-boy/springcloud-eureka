package com.chenjianwen.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 基于ribbon实现消费服务，通过http调用生产者服务
     * @return
     */
    @RequestMapping(value="/consumer")
    public Object consumer(){
        return restTemplate.getForObject("http://localhost:8080/eureka-provider/provider",String.class);
    }
}
