package org.cjk.group.controller;

import org.cjk.group.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class MessageController {
	
	// feign定义的接口
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "/message/{name}",method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "sayError") // 断路器注解
	public String sendMessage(@PathVariable("name") String name) {
		return messageService.sendMessage(name);
	}
	
	public String sayError(String name) {
        return "hi,"+name+"!";
    }
}
