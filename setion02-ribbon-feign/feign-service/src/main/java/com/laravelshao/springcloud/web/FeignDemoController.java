package com.laravelshao.springcloud.web;

import com.laravelshao.springcloud.service.FeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shaoqinghua on 2017/10/19.
 */
@RestController
public class FeignDemoController {

    @Autowired
    FeignDemoService feignDemoService;

    @RequestMapping("/one")
    public String one() {
        return feignDemoService.invocateOneService();
    }
}
