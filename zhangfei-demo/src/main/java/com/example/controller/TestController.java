package com.example.controller;

import com.example.feign.TestFeign;
import com.example.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zhangfei")
public class TestController {
    @Autowired
    private TestService testService;

    @Autowired
    private TestFeign testFeign;

    @RequestMapping("/test1")
    public String test1(){
        return  testFeign.test2();
    }

}
