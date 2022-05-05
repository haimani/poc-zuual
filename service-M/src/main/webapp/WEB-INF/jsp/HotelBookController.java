package com.poc.serviceM.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

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
	
	List<Hotel> hotelList = new ArrayList<>();
	
	Hashtable<String, Integer> limitTable = new Hashtable<>();
	
	Set<String> uniqueNames = new HashSet<>();
	
	Set<String> uniqueNumbers = new HashSet<>();
	
	@GetMapping("/bookHotel")
	public String bookHotel(ModelMap model) {
		model.put("hotel", new Hotel());
		return "bookHotel";
	}
	
	@PostMapping("/bookHotel")
	public RedirectView bookHotelRooms(@ModelAttribute("hotel") Hotel hotel,RedirectAttributes redirectAttributes) {
		
		final RedirectView redirectView = new RedirectView("/hotel/bookHotel",true);
		
		Hotel savedHotel = hotelBookService.bookRooms(hotel);
		
		boolean check = uniqueNumbers.add(savedHotel.getRoomNo());
		
		if(hotelList.size() == 5) {
			redirectAttributes.addFlashAttribute("roomLimit", "ROOMS ARE FILLED. NO ROOMS ARE AVAILABLE! ");
		}else if(check) {
			hotelList.add(savedHotel);
		}else {
			redirectAttributes.addFlashAttribute("bookedMsg","ROOM ALL READY BOOKED WITH ROOM NO - "+savedHotel.getRoomNo());
		}
		
		
		
		/*if(hotelList.size()>0) {
			
			for(Hotel ht : hotelList) {
				boolean flag = uniqueNames.add(ht.getHotelName());
				
				if(flag) {
					limitTable.put(ht.getHotelName(), 10);
				}
			}
			
		}*/
		
		
		
		redirectAttributes.addFlashAttribute("savedHotel", savedHotel);
		redirectAttributes.addFlashAttribute("hotelList", hotelList);
		
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
