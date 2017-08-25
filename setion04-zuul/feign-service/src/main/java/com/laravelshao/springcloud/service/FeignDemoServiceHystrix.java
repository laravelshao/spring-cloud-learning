package com.laravelshao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by shaoqinghua on 2017/10/22.
 */
@Component
public class FeignDemoServiceHystrix implements FeignDemoService {

    @Override
    public String invocateOneService() {
        return "feign service has error...";
    }
}
