package com.laravelshao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OneServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneServiceApplication.class, args);
	}
}
