package com.neuedu.plus;

import java.util.Arrays;

import java.util.Scanner;

public class StudentClient{ 	
	

	//初始化用户名和密码
	static String userName="admin";
	static String passWord="admin";
	
	//创建Scanner类
	Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		//创建一个客户端
		StudentClient studentClient=new StudentClient();
		studentClient.welcomePage();
		studentClient.stuManagerIndex();
		
	}
	//创建一个StudentManager对象
	StudentManager sm=new StudentManager(this);
	//欢迎界面
	public void welcomePage()
	{
		System.out.println("----------------欢迎登陆学生管理系统---------------------");
		System.out.println("1.登录           2.退出");
		System.out.println("--------------------------------------------------");
		//接收用户输入的1和2
		System.out.println("请选择：");
		int nextInt=scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录");
			System.out.println("请输入用户名:");
			String userName=scanner.next();
			System.out.println("请输入密码:");
			String psw=scanner.next();
			Admin admin=new Admin(userName,psw);
			boolean login=login(admin);
			if(login==true)
			{
				System.out.println("欢迎您"+userName+"登录");
			}else
			{
				System.out.println("登录失败...");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("已退出");
			exitSystem();
			
		break;
		default:
			System.out.println("输出有误，重新选择");
			welcomePage();
			break;
		}
	}
	
	//登录方法
	public boolean login(Admin admin){
		
		if(userName.equals(admin.userName)&&passWord.equals(admin.passWord))
		{
			return true;
		}else
		{
			return false;
		}
	}
	//退出程序
	public void exitSystem()
	{
		System.exit(0);
	}
	
	
	//学生管理的首页
	public void stuManagerIndex()
	{
		System.out.println("**************************请选择要操作的信息对应数字*************************");
		System.out.println("*1.查看学生信息             2.添加学生信息           3.删除学生信息            4.修改学生信息             5.退出               *");
		System.out.println("********************************************************************");
		System.out.println("请选择");
		//接受输入的选项
		int nextInt=scanner.nextInt();
		switch(nextInt){
		case 1:
			this.look();
			break;
		case 2:
			sm.addStuPage(scanner);
			break;
		case 3:
			this.delete();
			break;
		case 4:
			this.changeInfo();
			break;
		case 5:
			this.exitSystem();
			break;
			default:
				break;
		}
		this.stuManagerIndex();
	}
	//修改学生信息页面
	public void changeInfo(){
		//StudentClient stClient=new StudentClient();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1.根据ID修改学生全部信息             2.根据ID修改学生部分信息           3.返回上级目录               4.系统退出         ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("请选择");
		//接受输入的选项
		int nextInt=scanner.nextInt();
		switch (nextInt) {
		case 1:
			sm.updateStudentInfo(scanner);
			break;
		case 2:
			sm.updateStudentSomeInfo(scanner);
			break;
		case 3:
			this.stuManagerIndex();
			break;
		case 4:
			this.exitSystem();
		default:
			break;
		}
	}
	//根据id删除学生信息
	public void delete(){
		System.out.println("输入要删除的id");
		int id=scanner.nextInt();
		sm.delOneStudentByStuId(id);
	}
	//查看学生页面
	public void look(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ 1.查看所有学生信息             2.根据ID查询学生信息           3.根据ID查询学生姓名               4.返回上一层        ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择");
		//接受输入的选项
		int nextInt=scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			break;
		case 2:
			this.lookStById();
			break;
		case 3:
			this.lookStName();
			break;
		case 4:
			this.stuManagerIndex();
			break;
		default:
			break;
		}
	}
	//根据id查询学生信息
		public void lookStById(){
			System.out.println("输入id:");
			int id=scanner.nextInt();
			sm.LookStById(id);
		}
		//根据id查询学生姓名
		public void lookStName(){
			System.out.println("输入id:");
			int id=scanner.nextInt();
			sm.LookStName(id);
		}
}
