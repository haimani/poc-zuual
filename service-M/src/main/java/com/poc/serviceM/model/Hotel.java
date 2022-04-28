package com.poc.serviceM.model;

import java.util.List;

public class Hotel {

	private String hotelName;
	private String location;
	private String roomNo;
	
	public Hotel() {		
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, String location, String roomNo) {
		super();
		this.hotelName = hotelName;
		this.location = location;
		this.roomNo = roomNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", location=" + location + ", roomNo=" + roomNo + "]";
	}
	
		
}
