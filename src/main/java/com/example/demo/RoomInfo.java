package com.example.demo;

public class RoomInfo {
	private int id;
	
	private int roomnumber;
	private int price;
	private String status;
	private String roomtype;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public int getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Roominfo [id=" + id + ", roomnumber=" + roomnumber + ", price=" + price + ", status=" + status
				+ ", roomtype=" + roomtype + "]";
	}

}
