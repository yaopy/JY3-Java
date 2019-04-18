package com.neuedu.plus;

import java.util.Arrays;

import java.util.Scanner;

public class StudentClient{ 	
	

	//��ʼ���û���������
	static String userName="admin";
	static String passWord="admin";
	
	//����Scanner��
	Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		//����һ���ͻ���
		StudentClient studentClient=new StudentClient();
		studentClient.welcomePage();
		studentClient.stuManagerIndex();
		
	}
	//����һ��StudentManager����
	StudentManager sm=new StudentManager(this);
	//��ӭ����
	public void welcomePage()
	{
		System.out.println("----------------��ӭ��½ѧ������ϵͳ---------------------");
		System.out.println("1.��¼           2.�˳�");
		System.out.println("--------------------------------------------------");
		//�����û������1��2
		System.out.println("��ѡ��");
		int nextInt=scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼");
			System.out.println("�������û���:");
			String userName=scanner.next();
			System.out.println("����������:");
			String psw=scanner.next();
			Admin admin=new Admin(userName,psw);
			boolean login=login(admin);
			if(login==true)
			{
				System.out.println("��ӭ��"+userName+"��¼");
			}else
			{
				System.out.println("��¼ʧ��...");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("���˳�");
			exitSystem();
			
		break;
		default:
			System.out.println("�����������ѡ��");
			welcomePage();
			break;
		}
	}
	
	//��¼����
	public boolean login(Admin admin){
		
		if(userName.equals(admin.userName)&&passWord.equals(admin.passWord))
		{
			return true;
		}else
		{
			return false;
		}
	}
	//�˳�����
	public void exitSystem()
	{
		System.exit(0);
	}
	
	
	//ѧ���������ҳ
	public void stuManagerIndex()
	{
		System.out.println("**************************��ѡ��Ҫ��������Ϣ��Ӧ����*************************");
		System.out.println("*1.�鿴ѧ����Ϣ             2.���ѧ����Ϣ           3.ɾ��ѧ����Ϣ            4.�޸�ѧ����Ϣ             5.�˳�               *");
		System.out.println("********************************************************************");
		System.out.println("��ѡ��");
		//���������ѡ��
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
	//�޸�ѧ����Ϣҳ��
	public void changeInfo(){
		//StudentClient stClient=new StudentClient();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ             2.����ID�޸�ѧ��������Ϣ           3.�����ϼ�Ŀ¼               4.ϵͳ�˳�         ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("��ѡ��");
		//���������ѡ��
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
	//����idɾ��ѧ����Ϣ
	public void delete(){
		System.out.println("����Ҫɾ����id");
		int id=scanner.nextInt();
		sm.delOneStudentByStuId(id);
	}
	//�鿴ѧ��ҳ��
	public void look(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ 1.�鿴����ѧ����Ϣ             2.����ID��ѯѧ����Ϣ           3.����ID��ѯѧ������               4.������һ��        ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("��ѡ��");
		//���������ѡ��
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
	//����id��ѯѧ����Ϣ
		public void lookStById(){
			System.out.println("����id:");
			int id=scanner.nextInt();
			sm.LookStById(id);
		}
		//����id��ѯѧ������
		public void lookStName(){
			System.out.println("����id:");
			int id=scanner.nextInt();
			sm.LookStName(id);
		}
}
