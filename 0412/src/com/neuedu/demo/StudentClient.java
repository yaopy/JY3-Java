package com.neuedu.demo;

import java.util.Scanner;

//客户端
public class StudentClient {

	//初始化用户名和密码
	static String userName = "admin";
	static String passWord = "admin";
	
	//创建Scanner类
	Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//创建一个客户端
		StudentClient studentClient  = new StudentClient();
		studentClient.welcomePage();

		
		
		
	}
	
	//欢迎界面
	public void welcomePage()
	{
		System.out.println("-------------------欢迎登陆学生信息管理系统---------------");
		System.out.println("1.登录        2.退出");
		System.out.println("---------------------------------------------------------");
		//接受用户创建的1和2
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名：");
			String userName = scanner.next();
			System.out.println("请输入密码：");
			String psw = scanner.next();
			Admin admin = new Admin(userName, psw);
			boolean login = login(admin);
			if(login == true)
			{
				System.out.println("欢迎您"+userName+"登录！");
			}else
			{
				System.out.println("登录失败..");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("已退出..");
			exitSystem();
			break;
	
		default:
			System.out.println("输入有误，重新选择");
			welcomePage();
			break;
		}
		
	}
	
	
	//登录方法
	public boolean login(Admin admin)
	{
		
		//判断传入的用户名密码是否一致
		if (userName.equals(admin.userName) && passWord.equals(admin.passWord))
		{
			return true;
			
		}
		return false;
	}
	 
	
	
	//退出程序
	public void exitSystem()
	{
		System.exit(0);
	}
	
}
