package com.laravelshao.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by shaoqinghua on 2017/10/17.
 */
@RestController
public class DemoController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/one")
    public String one(){
        return restTemplate.getForObject("http://ONE-SERVICE/one",String.class);
    }

}
