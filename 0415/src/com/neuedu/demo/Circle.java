package com.neuedu.demo;

public class Circle extends Shape{

	int r;
	Point p;
	
	public Circle() 
	{
		
		
	}
	public Circle(int r,Point p) 
	{
		this.r = r;
		this.p = p;
		
	}
	@Override
	public double getArea() {
		 double area = Math.PI*Math.pow(r,2);
		 return area;
	}
	@Override
	public void setPosition(Point p) {
		System.out.println("圆的圆心为" + p.x +","+p.y);
		this.p = p;
		
	}

	 @Override
	public void contains(Point judge) {


		 double d = Math.sqrt(Math.pow(p.x-judge.x, 2)+Math.pow( p.y-judge.y, 2));
			if(d <= r) {
				System.out.println("点在圆内");
			}else {
				System.out.println("点在圆外");
			}
	}
	

}
