package com.neuedu.demo;

public class Vehicle {
	
	public Vehicle()
	{
		
	}
	public Vehicle(String brand,String color,double speed)
	{
		this.brand = brand;
		this.color = color;
		this.speed = 0;
		
	}
	
	 
	
	String brand;
	String color;
	double speed;
	
	
	public void run()
	{
		System.out.println("ÕıÔÚÒÆ¶¯..");
	}
	
}
