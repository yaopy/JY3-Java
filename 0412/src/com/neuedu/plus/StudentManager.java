package com.neuedu.plus;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
	
	StudentClient scClient;
	public StudentManager(){}
	public StudentManager(StudentClient sc){
		this.scClient=sc;
	}
	//����һ��ѧ������
	static Student[] stus=new Student[0];
	//����һ��ɾ���������
	static Student[] newStus;
	//StudentClient sc=new StudentClient();
	//���ѧ��
	public void addStudent(Student student)
	{
		 stus=Arrays.copyOf(stus, stus.length+1);
		 stus[stus.length-1]=student;
	}
	//���ѧ������
	public void addStuPage(Scanner scanner)
	{
		System.out.println("������ѧ��ID:");
		int id=scanner.nextInt();
		System.out.println("������ѧ������:");
		String name=scanner.next();
		System.out.println("������ѧ���Ա�:");
		char sex=scanner.next().charAt(0);
		System.out.println("������ѧ������:");
		short age=scanner.nextShort();
		System.out.println("������ѧ���꼶:");
		String grade=scanner.next();
		System.out.println("������ѧ����ַ:");
		String address=scanner.next();
		System.out.println("������ѧ����ϵ��ʽ:");
		int tel=scanner.nextInt();
		System.out.println("������ѧ����������:");
		String email=scanner.next();
		StudentManager studentmanager=new StudentManager();
		Student stu=new Student(id,name,sex,age,grade,address,tel,email);
		studentmanager.addStudent(stu);
		System.out.println("���ݱ���ɹ��������ϲ�Ŀ¼");
		scClient.stuManagerIndex();
	}
	//����IDɾ��ѧ��
	public Student[] delOneStudentByStuId(int stuId)
	{
		newStus=new Student[stus.length-1];
		int j=0;
		//���������е�Ԫ��
		for(int i=0;i<stus.length;i++)
		{
			
			//�ж������е�ѧ���Ƿ���idΪstuId��ѧ��
			if(stuId!=stus[i].id)
			{
				
				//�Ѳ���ȵ�ѧ���Ž��µ�������
				newStus[j]=stus[i];
				j++;
			}
		}
		stus = newStus;
		return stus;
	}
	//����id�޸�ѧ��ȫ����Ϣ
	public void updateStudentInfo(Scanner scanner)
	{
		//StudentManager studentmanager=new StudentManager();
		System.out.println("������Ҫ�޸ĵ�id:");
		int id=scanner.nextInt();
		//�ҵ�Ҫ�޸ĵ�ѧ��
		for(int i=0;i<stus.length;i++)
		{
			//�ҵ�id��ͬ������ѧ��
			if(stus[i].id==id)
			{
				System.out.println("����:");
				stus[i].stuAge=scanner.nextShort();
				System.out.println("����:");
				stus[i].stuName=scanner.next();
				System.out.println("�Ա�:");
				stus[i].stuSex=scanner.next().charAt(0);
				System.out.println("�꼶:");
				stus[i].stuGrade=scanner.next();
				System.out.println("��ַ:");
				stus[i].stuAddress=scanner.next();
				System.out.println("�绰:");
				stus[i].stuTel=scanner.nextInt();
				System.out.println("����:");
				stus[i].stuEmail=scanner.next();
				System.out.println("�޸ĳɹ� ϵͳ�Զ������ϲ�Ŀ¼");
				scClient.changeInfo();
			}else{
				System.out.println("idδ�ҵ�����������");
				this.updateStudentInfo(scanner);
			}
		}	
	}
	//����id�޸�ѧ��������Ϣ
	public void updateStudentSomeInfo(Scanner scanner)
	{
		System.out.println("������Ҫ�޸ĵ�id:");
		int id=scanner.nextInt();
		//StudentManager studentmanager=new StudentManager();
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
				System.out.println("������Ҫ�޸ĵ�����:");
				String type=scanner.next();
				switch (type){
				case "age":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuAge=scanner.nextShort();
					break;
				case "name":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuName=scanner.next();
					break;
				case "sex":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuSex=scanner.next().charAt(0);
					break;
				case "grade":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuGrade=scanner.next();
					break;
				case "address":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuAddress=scanner.next();
					break;
				case "tel":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuTel=scanner.nextInt();
					break;
				case "email":
					System.out.println("������Ҫ�޸ĵ�����:");
					stus[i].stuEmail=scanner.next();
					break;
					default:
						break;
				}
				System.out.println("�޸ĳɹ� ϵͳ�Զ������ϲ�Ŀ¼");
				scClient.changeInfo();
			}else{
				System.out.println("idδ�ҵ�����������");
				this.updateStudentSomeInfo(scanner);
				}
		}
	}
	
	//����id��ѯѧ����Ϣ
	public void LookStById(int id){
		
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
				System.out.println("-----------------------------����ѧ����Ϣ-----------------");
				System.out.println("|ѧ�� |�� ��|����|�Ա�|�꼶|�绰                  |email   |      ��ַ                |");
				System.out.println("------------------------------------------------------");
				System.out.println("|"+stus[i].id+"|"+stus[i].stuName+"|"+stus[i].stuAge+"|"+stus[i].stuSex+"|"+stus[i].stuGrade+"|"+stus[i].stuTel+"|"+stus[i].stuTel+"|"+stus[i].stuAddress+"|");
				System.out.println("------------------------------------------------------");
				System.out.println("��ѯ��ϣ������ϼ�Ŀ¼");
				scClient.look();
			}else{
				System.out.println("idδ�ҵ�����������");
				scClient.lookStById();
			}	
		}
	}
	//����ID�鿴ѧ������
	public void LookStName(int id){
		for(int i=0;i<stus.length;i++)
		{
			if(stus[i].id==id)
			{
				System.out.println(stus[i].stuName);
			}else{
				System.out.println("idδ�ҵ�����������");
				scClient.lookStName();
			}
		}
	}
}



