package com.neuedu.demo;

public class User {
	//������
	public User() 
	{	
		//��ʼ������
		usernames =  new String[] {"hello"};
		psw = new String[] {"123456"};
		
	}
	String username;
	String password;
	//ģ��洢������
	String[] usernames;
	String[] psw;
	//����û����������Ƿ���ȷ
	public boolean checkUser(String username,String password)
	{   
		//ѭ���û�����
		for(int i =0;i<usernames.length;i++)
		{
			//�ж������û��������Ƿ���������û���
			if(usernames[i].equals(username)  && psw[i].equals(password) )
			{
				return true;
			}
			
		}
		return false;
	}
}
