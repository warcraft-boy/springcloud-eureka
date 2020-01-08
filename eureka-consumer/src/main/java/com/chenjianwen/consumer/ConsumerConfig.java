package com.chenjianwen.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: <br>
 * @Date: Created in 2020/1/8 <br>
 * @Author: chenjianwen
 */
@Configuration
public class ConsumerConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
