package com.example.controller;


import com.example.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ldz")
public class TestFeignController {
    @Autowired
    private TestFeign testFeign;

    @GetMapping("/test2")
    public String test2(){
        return  "我是test2";
    }

    @GetMapping("/test3")
    public String test3(){
        return  testFeign.test2();
    }
}
