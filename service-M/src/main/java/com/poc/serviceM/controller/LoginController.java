package com.poc.serviceM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.poc.serviceM.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@Autowired
	HotelBookController hotelBookController;
	
	@GetMapping("/login")
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String showWelcomePage(ModelMap model,@RequestParam String name, @RequestParam String password){
		
		boolean isValidUser = loginService.validateUser(name, password);
		
		if(!isValidUser) {
			model.put("errorMsg", "Invalid Credentials");
			model.put("userMsg","Enter Valid Username");
			model.put("pwdMsg","Enter Correct Password");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		
		return "redirect:/hotel/bookHotel";
		
	}
	
}
