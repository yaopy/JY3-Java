package com.neuedu.demo;

import java.util.Arrays;

public class StudentManager {

	//声明一个学生数组
	static Student[] stus = new Student[0];
	
	//声明一个删除后的数组
	static Student[] newStus = new Student[0];
	
	//添加学生
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus,stus.length+1);
		stus[stus.length-1] = student;
	}
	
	//根据ID删除学生
	public void delOneStudentByStuId(int stuId)
	{
		
		//遍历数组中的元素
		for(int i=0;i<stus.length;i++)
		{
			//判断数组中的学生是否有id为stuid的学生
			if(stuId != stus[i].id)
			{
				newStus = new Student[stus.length];
				//把不相等的学生放到新数组里
				newStus[i] = stus[i];
			}
		}
		System.out.println(Arrays.deepToString(newStus));
	}
	
	
	
	
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student stu = new Student(1,"张三",'男',(short)15,"初级","天津",103456789,"456@qq.com");
		studentManager.addStudent(stu);
		Student stu2 = new Student(2,"李四",'男',(short)15,"初级","天津",103456789,"456@qq.com");
		studentManager.addStudent(stu2);
		System.out.println(Arrays.toString(stus));
	}
}
