package com.poc.serviceCRM.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("CRM/")
public class CRMController {
	
	@GetMapping
	public String greetings() {
		return "Greetings from CRM Service";
	}

}
