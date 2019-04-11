package com.neuedu.demo;

import java.util.Scanner;

public class controlsystem{

	int selection;
	String user;
	String password;
	static int [] idinfo ={1,2,3};
	static String [] nameinfo = {"张一","张二","张三"};
	static int [] ageinfo = {15,20,25};
	static char [] sexinfo = {'男','女','男'};
	static String [] gradeinfo = {"初级","中级","高级"};
	static int [] phoneinfo = {1345678901,1345678902,1891234567};
	static String [] mailinfo = {"yi@163.com","er@163.com","sa@126.com"};
	static String [] addressinfo = {"北京市海淀区","上海市静安区","天津市东丽区"};
	
	
	
	
	public static void enter()
	{	
		System.out.print("请选择：");
		Scanner scanner1 = new Scanner(System.in);
		int enterbtn = scanner1.nextInt();
		
		if(enterbtn == 1)
		{
			System.out.println("欢迎登录！");
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("请输入用户名：");
			String uname = scanner2.next();
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("请输入密码：");
			String upsw = scanner3.next();
			if(uname.equals ("admin")&& upsw.equals("admin"))
			{
				System.out.println("登录成功！");
				System.out.println("欢迎您，admin");
			}else
			{
				System.out.println("正在退出..");
				scanner2.close();
				scanner3.close();
			
			}

		}else
		{
			System.out.println("正在退出..");
			scanner1.close();
		
		}
		
	}
	
	
	public  static void controlfunction() {
		
		System.out.println("***********************请选择要操作的信息对应数字***********************");
		System.out.println("*1.查看学生信息    2.添加学生信息    3.删除学生信息    4.修改学生信息    5.退出      *");
		System.out.println("***********************************************************************");
		System.out.print("请选择：");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1)
		{
			controlsystem.controlinquery();
		}
		if (choice == 2)
		{
			controlsystem.controladd();
		}
		if (choice == 3)
		{
			controlsystem.controlfunction();
		}
		if (choice == 4)
		{
			controlsystem.controlchange();
		}
		if (choice == 5)
		{
			controlsystem.enter();
		}
		

	}

	
	public static void controladd() 
	{
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("请输入学生id：");
		int sid = scanner1.nextInt();
		for (int id :idinfo)
		{
			if(sid == id )
			{
				System.out.println("此id已存在，请重新输入：");
				controlsystem.controladd();
			}
			else
			{
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("请输入学生姓名：");
				String sname = scanner2.next();
				Scanner scanner3 = new Scanner(System.in);
				System.out.print("请输入学生性别：");
				String ssex = scanner3.next();
				Scanner scanner4 = new Scanner(System.in);
				System.out.print("请输入学生年龄(只能1-120之间的数字)：");
				String sage = scanner4.next();
				Scanner scanner5 = new Scanner(System.in);
				System.out.print("请输入学生所属年级(只能初级、中级、高级)：");
				String sgrade = scanner5.next();
				Scanner scanner6 = new Scanner(System.in);
				System.out.print("请输入学生地址：");
				String saddress = scanner6.next();
				Scanner scanner7 = new Scanner(System.in);
				System.out.print("请输入学生联系方式(11位手机号码)：");
				String sphone = scanner7.next();
				Scanner scanner8 = new Scanner(System.in);
				System.out.print("请输入学生电子邮箱(包含@和.com)：");
				String semail = scanner8.next();
				System.out.println("数据保存成功，系统将自动返回上层目录~");
				controlsystem.controlfunction();

			}
		}

	}
	
	
	public  static void controlchange()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1.根据ID修改学生全部信息      2.根据ID修改学生部分信息      3.返回上级目录      4.系统退出");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("请选择：");
		Scanner chaselt = new Scanner(System.in);
		int determine = chaselt.nextInt();
		if (determine == 1)
		{
			controlsystem.controlchange();
		}
		if (determine == 2)
		{
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("请输入要修改的学生id：");
			String sid = scanner1.next();
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("请输入要修改的属性：");
			String swhich = scanner2.next();
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("请输入修改后的数据：");
			String safter = scanner3.next();
			System.out.println("数据保存成功，系统将自动返回上层目录~");
			controlsystem.controlchange();
			

			
		}
		if (determine == 3)
		{
			controlsystem.controlfunction();
		}
		if (determine == 4)
		{
			controlsystem.controlchange();
		}
		

	}
	
	
	public static void controlinquery()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+   1.查看所有学生信息      2.根据ID查询学生信息      3.根据姓名查询学生信息      4.返回上一级        +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("请选择：");
		Scanner findselt = new Scanner(System.in);
		int selection = findselt.nextInt();
		if(selection == 1)
		{
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|学号       |姓名       |年龄       |性别       |年级       |电话                  |EMAIL         |地址                         |");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|"+ idinfo[0]+"      "  + "|"+ nameinfo[0]+"       "+  "|"  +  ageinfo[0] +"     " + "|"+ sexinfo[0] +"           " +   "|" +  gradeinfo[0]+"       "+ "|" + phoneinfo[0] +"  "+      "|"+    mailinfo[0]+"   " +  "|"+ addressinfo[0]+"        "+  "|"  );
			System.out.println("|"+ idinfo[1]+"      "  + "|"+ nameinfo[1]+"       "+  "|"  +  ageinfo[1] +"     " + "|"+ sexinfo[1] +"           " +   "|" +  gradeinfo[1]+"       "+ "|" + phoneinfo[1] +"  "+      "|"+    mailinfo[1]+"   " +  "|"+ addressinfo[1]+"        "+  "|"  );
			System.out.println("|"+ idinfo[2]+"      "  + "|"+ nameinfo[2]+"       "+  "|"  +  ageinfo[2] +"     " + "|"+ sexinfo[2] +"           " +   "|" +  gradeinfo[2]+"       "+ "|" + phoneinfo[2] +"  "+      "|"+    mailinfo[2]+"   " +  "|"+ addressinfo[2]+"        "+  "|"  );
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("数据查询完毕，系统将自动返回上一级..");
			controlsystem.controlinquery();
		}
		if(selection == 2)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要查找的id：");
			int sid = scanner.nextInt();
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|学号       |姓名       |年龄       |性别       |年级       |电话                  |EMAIL         |地址                         |");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|"+ idinfo[sid-1]+"      "  + "|"+ nameinfo[sid-1]+"       "+  "|"  +  ageinfo[sid-1] +"     " + "|"+ sexinfo[sid-1] +"           " +   "|" +  gradeinfo[sid-1]+"       "+ "|" + phoneinfo[sid-1] +"  "+      "|"+    mailinfo[sid-1]+"   " +  "|"+ addressinfo[sid-1]+"        "+  "|"  );
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("数据查询完毕，系统将自动返回上一级..");
			controlsystem.controlinquery();
		}
		if(selection == 3)
		{
			controlsystem.controlinquery();
		}
		if(selection == 4)
		{
			controlsystem.controlinquery();
		}
			
	}

}
