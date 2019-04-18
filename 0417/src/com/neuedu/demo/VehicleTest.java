package com.neuedu.demo;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("benz","black",6.0);
		vehicle.run();
		System.out.println(vehicle.speed);
		Car car = new Car("Honda","red",6.0,2);
	
	}
}
