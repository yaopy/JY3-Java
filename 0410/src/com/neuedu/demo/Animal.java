package com.neuedu.demo;

//基类 超类 父类
//子类继承父类属性和方法
//构造器不能继承
//实例化子类会递归分配所有父类空间
//子类构造器一定调用父类构造器
//类一定有构造器（父类、子类）


public class Animal {

	public Animal()
	{
		System.out.println("父类构造器");
	}
	
	String animalName;
	String animalType;
	int weight;
	public void run()
	{
		System.out.println("跑起来..");
	}
}
//继承
class Dog extends Animal
{
	public void sys()
	{
		System.out.println(animalName);
	}
}
class ErHa extends Dog
{
	
}