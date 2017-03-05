package com.feignClient1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:8081",name="EUREKA-CLIENT1")
public interface FeignClient1 {
	
	@RequestMapping(path="/info",method=RequestMethod.GET)
	public String getInfo();
}
