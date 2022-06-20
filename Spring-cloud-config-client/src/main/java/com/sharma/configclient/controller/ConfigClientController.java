package com.sharma.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
	
	@Value("${message:Default Message}")
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		return message;
	}
}
