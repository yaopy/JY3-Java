package com.neuedu.demo;

public class TestShape {


	public static void main(String[] args)
	{
		 	Point center=new Point(0,0);
		    Circle circle = new Circle(1,center);
		    Point p=new Point(3,3);
		    Point judge=new Point(3,3);
		    circle.setPosition(p);
		    circle.getArea();
			circle.contains(judge);
		    
	}
	
}
