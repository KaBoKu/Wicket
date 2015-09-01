package com.mkyong.user;

import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
@Service
public class HelloServiceImpl implements HelloService {
	Logger logger = Logger.getLogger(HelloService.class);
	public String getHelloWorldMsg() {
		logger.info("getHelloWorldMsg");
		return "Spring : hello world";
	}

}