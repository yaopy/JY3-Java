package com.neuedu.demo;

import java.util.Scanner;

//�ͻ���
public class StudentClient {

	//��ʼ���û���������
	static String userName = "admin";
	static String passWord = "admin";
	
	//����Scanner��
	Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//����һ���ͻ���
		StudentClient studentClient  = new StudentClient();
		studentClient.welcomePage();

		
		
		
	}
	
	//��ӭ����
	public void welcomePage()
	{
		System.out.println("-------------------��ӭ��½ѧ����Ϣ����ϵͳ---------------");
		System.out.println("1.��¼        2.�˳�");
		System.out.println("---------------------------------------------------------");
		//�����û�������1��2
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.println("�������û�����");
			String userName = scanner.next();
			System.out.println("���������룺");
			String psw = scanner.next();
			Admin admin = new Admin(userName, psw);
			boolean login = login(admin);
			if(login == true)
			{
				System.out.println("��ӭ��"+userName+"��¼��");
			}else
			{
				System.out.println("��¼ʧ��..");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("���˳�..");
			exitSystem();
			break;
	
		default:
			System.out.println("������������ѡ��");
			welcomePage();
			break;
		}
		
	}
	
	
	//��¼����
	public boolean login(Admin admin)
	{
		
		//�жϴ�����û��������Ƿ�һ��
		if (userName.equals(admin.userName) && passWord.equals(admin.passWord))
		{
			return true;
			
		}
		return false;
	}
	 
	
	
	//�˳�����
	public void exitSystem()
	{
		System.exit(0);
	}
	
}
