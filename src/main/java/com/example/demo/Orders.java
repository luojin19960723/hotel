package com.example.demo;

public class Orders {
	private int id;
	private String name;
	private String idcard;
	private String gender;
	private String phone;


	private String  roomtype;
	private int  roomnumber;
	
	private int  money;
/**
 * 
create table orders(
id int  primary key auto_increment,
name char(10) not null,

idcard char(30) not null,
gender char(2) not null,
phone char(12) not null,
roomtype char(12) not null,
roomnumber  int not null unique,


money int not null

);
 * @return
 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public int getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", idcard=" + idcard + ", gender=" + gender + ", phone=" + phone
				+ ", roomtype=" + roomtype + ", roomnumber=" + roomnumber + ", money=" + money + "]";
	}
	


}
