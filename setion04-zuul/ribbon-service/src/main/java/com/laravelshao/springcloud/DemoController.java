package com.laravelshao.springcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "serviceError")
    public String one(){
        return restTemplate.getForObject("http://ONE-SERVICE/one",String.class);
    }

    /**
     *服务异常调用方法
     * @return
     */
    public String serviceError(){
        return "service has error...";
    }

}
