package com.poc.servicePOS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("POS/")
public class POSController {
	
	@GetMapping
	public String greetings() {
		return "Greetings from POS Service";
	}

}
