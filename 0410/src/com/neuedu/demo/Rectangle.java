package com.neuedu.demo;

public class Rectangle {

	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	int length;
	int width;
	
	public int getArea()
	{	
		int Area = width * length;
		return Area ;
	}
	
	public int getPer()
	{
		int Per = 2*width + 2*length;
		return Per;
	}
	
	public void showAll()
	{
		System.out.println("长方形的长为："+length);
		System.out.println("长方形的宽为："+width);
		System.out.println("长方形的面积为："+getArea());
		System.out.println("长方形的周长为："+getPer());
	}

}
