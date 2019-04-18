package com.neuedu.demo;

public class Car extends Vehicle{

	public Car()
	{
		
		
	}
	public Car(String brand,String color,double speed,int loader) 
	{
		this.brand = brand;
		this.color = color;
		this.speed = 0.0;
		this.loader = loader;
	}
	
	
	int loader;
	
	@Override
	public void run() {
		System.out.println("叮叮车跑得好快鸭..");
	}
}
