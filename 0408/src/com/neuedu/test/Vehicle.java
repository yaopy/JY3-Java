package com.neuedu.test;

import java.util.Scanner;

public class Vehicle {

	public  Vehicle() 
	{
		speed = 100;
		size = 1 ;
		color = "black";
	}
		int speed;
		int size;
		String color;
		
		public void move() 
		{
			System.out.println("�ƶ�..");
		}
		public void setspeed() 
		{   Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ���õ��ٶȴ�С��");
			int a = scanner.nextInt();
			speed = a;
			System.out.println("�ѽ��ٶ�����Ϊ��"+a);
		}
		
	
	public static void main(String[] args) 
	{		
		Vehicle car = new Vehicle();
		System.out.println(car.speed );
		System.out.println(car.size);
		System.out.println(car.color);
		car.setspeed();
		
	}
	
}
