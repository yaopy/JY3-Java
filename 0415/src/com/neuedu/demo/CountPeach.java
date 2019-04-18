package com.neuedu.demo;

public class CountPeach 
{
	static int x;
	
	public static int f1()
	{   
		int eatnum = x/2 + 1;
		int rest = x - eatnum;
		return rest;
	
	}
public static void main(String[] args) 
{
	int i;
	for(i = 1;i <= 10;i++)
	{
		int rest = x;
		x = CountPeach.f1();
	}
	System.out.println(x);
}

}
