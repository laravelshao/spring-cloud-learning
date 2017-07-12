package com.laravelshao.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LaravelShao on 2017/9/6.
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/one")
    public String one() {
        return "one-service test port:" + port;
    }

}
