package com.neuedu.demo;

//Bean规范
//必须有包（package）
//Java 类，具有无参数构造器
//有用 getXxx() 和 setXxx() 声明的 Bean 属性

public class Shape {

	Point p;
	public Shape()
	{
		
	}
	 public double getArea() 
	 { 
		 double area = 0.0;
		 return area;
	 }
	 public void setPosition(Point p)
	 {
		 System.out.println("图形的位置由p点决定..");
	 }
	 public void contains(Point p)
	 {
		 
		
	 }
}
