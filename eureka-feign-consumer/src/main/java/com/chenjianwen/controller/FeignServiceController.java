package com.chenjianwen.controller;


import com.chenjianwen.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServiceController {

    @Autowired
    private FeignClientService feignClientService;

    @RequestMapping(value="/feignInvoke")
    public String feignService(){
        return feignClientService.invokeService();
    }
}
