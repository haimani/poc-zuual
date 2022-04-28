package com.poc.serviceM.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.serviceM.model.Hotel;
import com.poc.serviceM.model.Rooms;

@Service
public class HotelBookService {

	
	public Hotel bookRooms(Hotel hotel) {
		
		hotel.setHotelName(hotel.getHotelName());
		hotel.setLocation(hotel.getLocation());
		hotel.setRoomNo(hotel.getRoomNo());
		
		return hotel;
		
	}
	
	public boolean validateHotel(Hotel hotel) {
		
		return (hotel.getHotelName()!=null && !hotel.getHotelName().isEmpty()) 
				&& (hotel.getLocation()!=null && !hotel.getLocation().isEmpty())
				&& (hotel.getRoomNo()!=null && !hotel.getRoomNo().isEmpty()) ? true :false;
		
	}
}
