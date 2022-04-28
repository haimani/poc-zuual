package com.poc.serviceM.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String username, String password) {
		return (username.equalsIgnoreCase("user") && password.equalsIgnoreCase("password"));
	}
	
}
