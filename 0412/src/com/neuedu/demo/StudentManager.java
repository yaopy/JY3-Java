package com.neuedu.demo;

import java.util.Arrays;

public class StudentManager {

	//����һ��ѧ������
	static Student[] stus = new Student[0];
	
	//����һ��ɾ���������
	static Student[] newStus = new Student[0];
	
	//���ѧ��
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus,stus.length+1);
		stus[stus.length-1] = student;
	}
	
	//����IDɾ��ѧ��
	public void delOneStudentByStuId(int stuId)
	{
		
		//���������е�Ԫ��
		for(int i=0;i<stus.length;i++)
		{
			//�ж������е�ѧ���Ƿ���idΪstuid��ѧ��
			if(stuId != stus[i].id)
			{
				newStus = new Student[stus.length];
				//�Ѳ���ȵ�ѧ���ŵ���������
				newStus[i] = stus[i];
			}
		}
		System.out.println(Arrays.deepToString(newStus));
	}
	
	
	
	
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student stu = new Student(1,"����",'��',(short)15,"����","���",103456789,"456@qq.com");
		studentManager.addStudent(stu);
		Student stu2 = new Student(2,"����",'��',(short)15,"����","���",103456789,"456@qq.com");
		studentManager.addStudent(stu2);
		System.out.println(Arrays.toString(stus));
	}
}
