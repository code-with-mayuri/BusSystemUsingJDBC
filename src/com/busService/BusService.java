package com.busService;

import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Scanner;

import com.daoimplementaion.BusImplementaion;
import com.entity.BusEntity;


public class BusService {
	public List<BusEntity> showdata()throws ClassNotFoundException,SQLException
	{
		List<BusEntity> li=new BusImplementaion().viewall();
		
		for (BusEntity busEntity : li) {
			System.out.println(busEntity);
		}
		return li;
	}
	public void insertBooking() throws ClassNotFoundException, SQLException
	{
		BusEntity bus=new BusEntity();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int Id=sc.nextInt();
		System.out.println("enter the name");
		String Name=sc.next();
		System.out.println("enter the Bus_root");
		String 	Bus_root=sc.next();
		System.out.println("enter the Bus_time");
		String Bus_time=sc.next();	
		System.out.println("enter the seat_no");
		int Seat_no=sc.nextInt();
		System.out.println("enter the amount");
		float amount=sc.nextFloat();
		bus.setId(Id);
		bus.setName(Name);
		bus.setBus_root(Bus_root);
		bus.setBus_time(Bus_time);
		bus.setSeat_no(Seat_no);
		bus.setAmount(amount);
		new BusImplementaion().insertreservation(bus);
		
		
	}
	public void UpdateBooking() throws ClassNotFoundException, SQLException
	{
		BusEntity bus=new BusEntity();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String Name=sc.next();
		System.out.println("enter the Bus_root");
		String 	Bus_root=sc.next();
		System.out.println("enter the Bus_time");
		String Bus_time=sc.next();	
		System.out.println("enter the seat_no");
		int Seat_no=sc.nextInt();
		System.out.println("enter the amount");
		float amount=sc.nextFloat();
		System.out.println("enter the id");
		int Id=sc.nextInt();
		bus.setId(Id);
		bus.setName(Name);
		bus.setBus_root(Bus_root);
		bus.setBus_time(Bus_time);
		bus.setSeat_no(Seat_no);
		bus.setAmount(amount);
		new BusImplementaion().updatereservation(bus);

	
}
	public void deleteBusReservation()throws ClassNotFoundException,SQLException
	{
		BusEntity bus=new BusEntity();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		int Id=sc.nextInt();
		
		bus.setId(Id);
		new BusImplementaion().deletereservation(bus);

	}
}
