package com.example.falllback;

import com.example.feign.TestFeign;

public class TestApiFaallback  implements TestFeign {


    @Override
    public String test2() {
        return "error";
    }
}
