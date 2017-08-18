package com.laravelshao.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shaoqinghua on 2017/10/19.
 */
@FeignClient("one-service")
public interface FeignDemoService {

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    String invocateOneService();
}
