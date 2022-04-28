package com.poc.serviceM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MController {
	
	@GetMapping("/greet")
	public String greetings() {
		return "Greetings from M Service";
	}
	
	@GetMapping("/hello")
	public String greetings1() {
		return "Hello From M Service";
	}

	
	@GetMapping("/account-id")
	public void getBookingDetailsByAccountId(@PathVariable long accountId) {
		
		
	}
}	
