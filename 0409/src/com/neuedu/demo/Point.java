package com.neuedu.demo;

//import java.util.Scanner;

public class Point {
	int x;
	int y;
	public Point() 
	{
		
	}
	public Point(int x0,int y0)
	{
		this.x = x0;
		this.y = y0;
		
	}
	public void movePoint(int dx,int dy)
	{	
		
		 x = x+dx;
		 y = y+dy;
		 System.out.print("移动后的点为："+"("+x+",");
		 System.out.print(y+")");
	
		
		
	}
	

}
