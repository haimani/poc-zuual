package com.poc.serviceM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.poc.serviceM.model.Hotel;
import com.poc.serviceM.service.HotelBookService;

@Controller
@RequestMapping("/hotel")
public class HotelBookController {

	
	@Autowired
	HotelBookService hotelBookService;
	
	
	@GetMapping("/bookHotel")
	public String bookHotel(ModelMap model) {
		model.put("hotel", new Hotel());
		return "bookHotel";
	}
	
	@PostMapping("/bookHotel")
	public RedirectView bookHotelRooms(@ModelAttribute("hotel") Hotel hotel,RedirectAttributes redirectAttributes) {
		
		final RedirectView redirectView = new RedirectView("/hotel/bookHotel",true);
		
		Hotel savedHotel = hotelBookService.bookRooms(hotel);
		
		redirectAttributes.addFlashAttribute("savedHotel", savedHotel);
		
		boolean isValidHotel = hotelBookService.validateHotel(savedHotel);
		
		if(isValidHotel) {
			
			redirectAttributes.addFlashAttribute("hotelBookSuccess",true);
		
		}else {
			redirectAttributes.addFlashAttribute("hotelBookSuccess",false);
			redirectAttributes.addFlashAttribute("hotelNameMsg", "Enter Hotel Name");
			redirectAttributes.addFlashAttribute("locationMsg", "Enter Location");
			redirectAttributes.addFlashAttribute("roomNoMsg","Enter Room No");
		}
		return redirectView;
	}
	
	
}
