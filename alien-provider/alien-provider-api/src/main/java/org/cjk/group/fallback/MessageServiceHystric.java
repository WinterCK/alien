package org.cjk.group.fallback;

import org.cjk.group.service.MessageService;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceHystric implements MessageService {

	@Override
	public String sendMessage(String name) {
		return "send message error, please try again later ！";
	}

}
