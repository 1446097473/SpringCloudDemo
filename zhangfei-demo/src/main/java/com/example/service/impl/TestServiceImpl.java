package com.example.service.impl;

import com.example.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test1() {
        return "test";
    }
}
