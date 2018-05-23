package com.bocom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/home")
	String home() {
		return "Hello Worl1222!"; 
	}
}
