package org.cjk.group.service;

import org.cjk.group.fallback.ServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// feignClient添加熔断器直接加  fallback
@FeignClient(value = "alien-provider-core", fallback = ServiceHiHystric.class)//指定调用哪个服务（eureka-client）
public interface ServiceHi {
	
	@RequestMapping(value = "/say/{name}",method = RequestMethod.GET)//指定服务使用的urlMapping
	String saySomeByRPC(@PathVariable("name") String name);
}
