package com.neuedu.demo;

public class Person {

	private int age;
	private String name;
	//���� ��������
	public void setAge(int age)
	{
		if(age <= 0 || age > 150)
		{
			System.out.println("���䲻�Ϸ�..");
			
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
