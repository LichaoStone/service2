package com.allook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableHystrix
public class Service2Application {
	@RequestMapping("/")
	public String home() {
		return "Hello!  I am Service2... ...";
	}
	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}
}
