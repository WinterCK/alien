package org.cjk.group.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceHiImpl {

	@Value("${server.port}")
    private String port;
	
	@Value("${spring.application.name}")
	private String serviceName;
	
	@RequestMapping(value = "/say/{name}",method = RequestMethod.GET)
	public String saySomeByRPC(@PathVariable("name") String name) {
		return "Hello " + name + " I am from service: " + serviceName + " and port: " + port;
	}
}
