package com.poc.serviceM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController {
	
	@GetMapping("/M")
	public String greetings() {
		return "Greetings from M Service";
	}
	
	@GetMapping("/hello")
	public String greetings1() {
		return "Greetings from M Service";
	}

}	
