package com.example.feign;

import com.example.falllback.TestApiFaallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "demo1-service", fallbackFactory = TestApiFaallback.class)
public interface TestFeign {
    @GetMapping("/ldz/test2")
    String test2();
}
