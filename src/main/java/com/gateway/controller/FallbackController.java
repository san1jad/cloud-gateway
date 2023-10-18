package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/infoServiceFallback")
    public String infoServiceFallback(){
        return "Info service is down";
    }

    @GetMapping("/garbageServiceFallback")
    public String garbageServiceFallback(){
        return "Garbage service is down";
    }

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "User service is down";
    }
}
