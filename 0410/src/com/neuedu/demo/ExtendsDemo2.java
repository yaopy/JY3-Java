package com.neuedu.demo;

public class ExtendsDemo2 {
	
	public static void main(String[] args) {
		noteComputer noteComputer = new noteComputer();
		noteComputer.playGame();
	
	}

}

class Computer
{
	String brand;
	String type;
	
	public void playGame()
	{
		System.out.println("Gaming");
	}
	public void playCode()
	{
		System.out.println("Coding");
	}
}
class noteComputer extends Computer
{

//方法的重写
//	在子类中可以根据需要对继承父类方法进行重写
//	重写方法必须与被重写方法具有相同的方法名参数列表和返回值类型
//	重写方法不能使用比被重写更加严格的访问权限
	@Override
	public void playGame() {
//		super.playGame();
		System.out.println("玩高级Game");
	}
	
	
	//方法重载
	public void playCode(String name)
	{
		System.out.println(name+"敲代码");
	}
	

}




