package com.neuedu.demo;

public class Person {

	private int age;
	private String name;
	//公有 设置年龄
	public void setAge(int age)
	{
		if(age <= 0 || age > 150)
		{
			System.out.println("年龄不合法..");
			
		}else
		{
			this.age = age;
			
		}
	}
	public int getAge()
	{
		return age;
	}



}
