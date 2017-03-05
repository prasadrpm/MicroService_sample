package com.eurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feignClient1.FeignClient1;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class Client2Application {
	
	
	@Autowired
	private FeignClient1 feignClient1;

	public static void main(String[] args) {
		SpringApplication.run(Client2Application.class, args);
	}
	
	@RequestMapping(path="/info",method=RequestMethod.GET)
	public String getInfo() {
		return "Client2";
	}
	
	@RequestMapping(path="/info",method=RequestMethod.GET)
	public String getInfoClient1() {
		return feignClient1.getInfo();
	}
	
}
