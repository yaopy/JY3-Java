package com.neuedu.demo;

import java.util.Scanner;

public class controlsystem{

	int selection;
	String user;
	String password;
	static int [] idinfo ={1,2,3};
	static String [] nameinfo = {"��һ","�Ŷ�","����"};
	static int [] ageinfo = {15,20,25};
	static char [] sexinfo = {'��','Ů','��'};
	static String [] gradeinfo = {"����","�м�","�߼�"};
	static int [] phoneinfo = {1345678901,1345678902,1891234567};
	static String [] mailinfo = {"yi@163.com","er@163.com","sa@126.com"};
	static String [] addressinfo = {"�����к�����","�Ϻ��о�����","����ж�����"};
	
	
	
	
	public static void enter()
	{	
		System.out.print("��ѡ��");
		Scanner scanner1 = new Scanner(System.in);
		int enterbtn = scanner1.nextInt();
		
		if(enterbtn == 1)
		{
			System.out.println("��ӭ��¼��");
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("�������û�����");
			String uname = scanner2.next();
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("���������룺");
			String upsw = scanner3.next();
			if(uname.equals ("admin")&& upsw.equals("admin"))
			{
				System.out.println("��¼�ɹ���");
				System.out.println("��ӭ����admin");
			}else
			{
				System.out.println("�����˳�..");
				scanner2.close();
				scanner3.close();
			
			}

		}else
		{
			System.out.println("�����˳�..");
			scanner1.close();
		
		}
		
	}
	
	
	public  static void controlfunction() {
		
		System.out.println("***********************��ѡ��Ҫ��������Ϣ��Ӧ����***********************");
		System.out.println("*1.�鿴ѧ����Ϣ    2.���ѧ����Ϣ    3.ɾ��ѧ����Ϣ    4.�޸�ѧ����Ϣ    5.�˳�      *");
		System.out.println("***********************************************************************");
		System.out.print("��ѡ��");
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
		System.out.print("������ѧ��id��");
		int sid = scanner1.nextInt();
		for (int id :idinfo)
		{
			if(sid == id )
			{
				System.out.println("��id�Ѵ��ڣ����������룺");
				controlsystem.controladd();
			}
			else
			{
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("������ѧ��������");
				String sname = scanner2.next();
				Scanner scanner3 = new Scanner(System.in);
				System.out.print("������ѧ���Ա�");
				String ssex = scanner3.next();
				Scanner scanner4 = new Scanner(System.in);
				System.out.print("������ѧ������(ֻ��1-120֮�������)��");
				String sage = scanner4.next();
				Scanner scanner5 = new Scanner(System.in);
				System.out.print("������ѧ�������꼶(ֻ�ܳ������м����߼�)��");
				String sgrade = scanner5.next();
				Scanner scanner6 = new Scanner(System.in);
				System.out.print("������ѧ����ַ��");
				String saddress = scanner6.next();
				Scanner scanner7 = new Scanner(System.in);
				System.out.print("������ѧ����ϵ��ʽ(11λ�ֻ�����)��");
				String sphone = scanner7.next();
				Scanner scanner8 = new Scanner(System.in);
				System.out.print("������ѧ����������(����@��.com)��");
				String semail = scanner8.next();
				System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
				controlsystem.controlfunction();

			}
		}

	}
	
	
	public  static void controlchange()
	{
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ      2.����ID�޸�ѧ��������Ϣ      3.�����ϼ�Ŀ¼      4.ϵͳ�˳�");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.print("��ѡ��");
		Scanner chaselt = new Scanner(System.in);
		int determine = chaselt.nextInt();
		if (determine == 1)
		{
			controlsystem.controlchange();
		}
		if (determine == 2)
		{
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("������Ҫ�޸ĵ�ѧ��id��");
			String sid = scanner1.next();
			Scanner scanner2 = new Scanner(System.in);
			System.out.print("������Ҫ�޸ĵ����ԣ�");
			String swhich = scanner2.next();
			Scanner scanner3 = new Scanner(System.in);
			System.out.print("�������޸ĺ�����ݣ�");
			String safter = scanner3.next();
			System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
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
		System.out.println("+   1.�鿴����ѧ����Ϣ      2.����ID��ѯѧ����Ϣ      3.����������ѯѧ����Ϣ      4.������һ��        +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print("��ѡ��");
		Scanner findselt = new Scanner(System.in);
		int selection = findselt.nextInt();
		if(selection == 1)
		{
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|ѧ��       |����       |����       |�Ա�       |�꼶       |�绰                  |EMAIL         |��ַ                         |");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|"+ idinfo[0]+"      "  + "|"+ nameinfo[0]+"       "+  "|"  +  ageinfo[0] +"     " + "|"+ sexinfo[0] +"           " +   "|" +  gradeinfo[0]+"       "+ "|" + phoneinfo[0] +"  "+      "|"+    mailinfo[0]+"   " +  "|"+ addressinfo[0]+"        "+  "|"  );
			System.out.println("|"+ idinfo[1]+"      "  + "|"+ nameinfo[1]+"       "+  "|"  +  ageinfo[1] +"     " + "|"+ sexinfo[1] +"           " +   "|" +  gradeinfo[1]+"       "+ "|" + phoneinfo[1] +"  "+      "|"+    mailinfo[1]+"   " +  "|"+ addressinfo[1]+"        "+  "|"  );
			System.out.println("|"+ idinfo[2]+"      "  + "|"+ nameinfo[2]+"       "+  "|"  +  ageinfo[2] +"     " + "|"+ sexinfo[2] +"           " +   "|" +  gradeinfo[2]+"       "+ "|" + phoneinfo[2] +"  "+      "|"+    mailinfo[2]+"   " +  "|"+ addressinfo[2]+"        "+  "|"  );
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�������һ��..");
			controlsystem.controlinquery();
		}
		if(selection == 2)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ���ҵ�id��");
			int sid = scanner.nextInt();
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|ѧ��       |����       |����       |�Ա�       |�꼶       |�绰                  |EMAIL         |��ַ                         |");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("|"+ idinfo[sid-1]+"      "  + "|"+ nameinfo[sid-1]+"       "+  "|"  +  ageinfo[sid-1] +"     " + "|"+ sexinfo[sid-1] +"           " +   "|" +  gradeinfo[sid-1]+"       "+ "|" + phoneinfo[sid-1] +"  "+      "|"+    mailinfo[sid-1]+"   " +  "|"+ addressinfo[sid-1]+"        "+  "|"  );
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�������һ��..");
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
