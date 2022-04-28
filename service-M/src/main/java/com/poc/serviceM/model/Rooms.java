package com.poc.serviceM.model;

public class Rooms {

	private String roomNo;
	private Hotel hotel;
	private boolean isBooked = false;
	
	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rooms(String roomNo, Hotel hotel, boolean isBooked) {
		super();
		this.roomNo = roomNo;
		this.hotel = hotel;
		this.isBooked = isBooked;
	}
	
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	@Override
	public String toString() {
		return "Rooms [roomNo=" + roomNo + ", hotel=" + hotel + "]";
	}	
	
	
}
