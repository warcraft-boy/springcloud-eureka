package com.chenjianwen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(value="/provider")
    public String provider(){
        return "I am provider!";
    }
}
