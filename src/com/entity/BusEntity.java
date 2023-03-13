package com.entity;

import java.sql.Time;

public class BusEntity {
private int id;
private String name;
private String bus_root;
private String bus_time;
private int seat_no;
private float amount;
public BusEntity()
{
	}


public BusEntity(int id, String name, String bus_root, String bus_time,
		int seat_no, float amount) {
	super();
	this.id = id;
	this.name = name;
	this.bus_root = bus_root;
	this.bus_time = bus_time;
	this.seat_no = seat_no;
	this.amount = amount;
}


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
public String getBus_root() {
	return bus_root;
}
public void setBus_root(String bus_root) {
	this.bus_root = bus_root;
}
public String getBus_time() {
	return bus_time;
}
public void setBus_time(String bus_time) {
	this.bus_time = bus_time;
}
public int getSeat_no() {
	return seat_no;
}
public void setSeat_no(int seat_no) {
	this.seat_no = seat_no;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "BusEntity [id=" + id + ", name=" + name + ", bus_root=" + bus_root
			+ ", bus_time=" + bus_time + ", seat_no=" + seat_no + ", amount="
			+ amount + "]";
}




}
