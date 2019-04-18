package com.neuedu.plus;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	StudentClient scClient;
	public StudentManager(){}
	public StudentManager(StudentClient sc){
		this.scClient=sc;
	}
	//声明一个学生数组
	static Student[] stus=new Student[0];
	//声明一个删除后的数组
	static Student[] newStus;
	//StudentClient sc=new StudentClient();
	//添加学生
	public void addStudent(Student student)
	{
		 stus=Arrays.copyOf(stus, stus.length+1);
		 stus[stus.length-1]=student;
	}
	//添加学生界面
	public void addStuPage(Scanner scanner)
	{
		System.out.println("请输入学生ID:");
		int id=scanner.nextInt();
		System.out.println("请输入学生姓名:");
		String name=scanner.next();
		System.out.println("请输入学生性别:");
		char sex=scanner.next().charAt(0);
		System.out.println("请输入学生年龄:");
		short age=scanner.nextShort();
		System.out.println("请输入学生年级:");
		String grade=scanner.next();
		System.out.println("请输入学生地址:");
		String address=scanner.next();
		System.out.println("请输入学生联系方式:");
		int tel=scanner.nextInt();
		System.out.println("请输入学生电子邮箱:");
		String email=scanner.next();
		StudentManager studentmanager=new StudentManager();
		Student stu=new Student(id,name,sex,age,grade,address,tel,email);
		studentmanager.addStudent(stu);
		System.out.println("数据保存成功，返回上层目录");
		scClient.stuManagerIndex();
	}
	//根据ID删除学生
	public Student[] delOneStudentByStuId(int stuId)
	{
		newStus=new Student[stus.length-1];
		int j=0;
		//遍历数组中的元素
		for(int i=0;i<stus.length;i++)
		{
			
			//判断数组中的学生是否有id为stuId的学生
			if(stuId!=stus[i].id)
			{
				
				//把不相等的学生放进新的数组里
				newStus[j]=stus[i];
				j++;
			}
		}
		stus = newStus;
		return stus;
	}
	//根据id修改学生全部信息
	public void updateStudentInfo(Scanner scanner)
	{
		//StudentManager studentmanager=new StudentManager();
		System.out.println("请输入要修改的id:");
		int id=scanner.nextInt();
		//找到要修改的学生
		for(int i=0;i<stus.length;i++)
		{
			//找到id相同的那名学生
			if(stus[i].id==id)
			{
				System.out.println("年龄:");
				stus[i].stuAge=scanner.nextShort();
				System.out.println("姓名:");
				stus[i].stuName=scanner.next();
				System.out.println("性别:");
				stus[i].stuSex=scanner.next().charAt(0);
				System.out.println("年级:");
				stus[i].stuGrade=scanner.next();
				System.out.println("地址:");
				stus[i].stuAddress=scanner.next();
				System.out.println("电话:");
				stus[i].stuTel=scanner.nextInt();
				System.out.println("邮箱:");
				stus[i].stuEmail=scanner.next();
				System.out.println("修改成功 系统自动返回上层目录");
				scClient.changeInfo();
			}else{
				System.out.println("id未找到，重新输入");
				this.updateStudentInfo(scanner);
			}
		}	
	}
	//根据id修改学生部分信息
	public void updateStudentSomeInfo(Scanner scanner)
	{
		System.out.println("请输入要修改的id:");
		int id=scanner.nextInt();
		//StudentManager studentmanager=new StudentManager();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
				System.out.println("请输入要修改的属性:");
				String type=scanner.next();
				switch (type){
				case "age":
					System.out.println("请输入要修改的数据:");
					stus[i].stuAge=scanner.nextShort();
					break;
				case "name":
					System.out.println("请输入要修改的数据:");
					stus[i].stuName=scanner.next();
					break;
				case "sex":
					System.out.println("请输入要修改的数据:");
					stus[i].stuSex=scanner.next().charAt(0);
					break;
				case "grade":
					System.out.println("请输入要修改的数据:");
					stus[i].stuGrade=scanner.next();
					break;
				case "address":
					System.out.println("请输入要修改的数据:");
					stus[i].stuAddress=scanner.next();
					break;
				case "tel":
					System.out.println("请输入要修改的数据:");
					stus[i].stuTel=scanner.nextInt();
					break;
				case "email":
					System.out.println("请输入要修改的数据:");
					stus[i].stuEmail=scanner.next();
					break;
					default:
						break;
				}
				System.out.println("修改成功 系统自动返回上层目录");
				scClient.changeInfo();
			}else{
				System.out.println("id未找到，重新输入");
				this.updateStudentSomeInfo(scanner);
				}
		}
	}
	
	//根据id查询学生信息
	public void LookStById(int id){
		
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
				System.out.println("-----------------------------所有学生信息-----------------");
				System.out.println("|学号 |姓 名|年龄|性别|年级|电话                  |email   |      地址                |");
				System.out.println("------------------------------------------------------");
				System.out.println("|"+stus[i].id+"|"+stus[i].stuName+"|"+stus[i].stuAge+"|"+stus[i].stuSex+"|"+stus[i].stuGrade+"|"+stus[i].stuTel+"|"+stus[i].stuTel+"|"+stus[i].stuAddress+"|");
				System.out.println("------------------------------------------------------");
				System.out.println("查询完毕，返回上级目录");
				scClient.look();
			}else{
				System.out.println("id未找到，重新输入");
				scClient.lookStById();
			}	
		}
	}
	//根据ID查看学生姓名
	public void LookStName(int id){
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
				System.out.println(stus[i].stuName);
			}else{
				System.out.println("id未找到，重新输入");
				scClient.lookStName();
			}
		}
	}
}



