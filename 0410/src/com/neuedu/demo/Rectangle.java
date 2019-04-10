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
		System.out.println("�����εĳ�Ϊ��"+length);
		System.out.println("�����εĿ�Ϊ��"+width);
		System.out.println("�����ε����Ϊ��"+getArea());
		System.out.println("�����ε��ܳ�Ϊ��"+getPer());
	}

}
