package com.neuedu.demo;
//ѡ����


public class Question {

	//���
	int id;
	//���
	String text;
	//ѡ��
	String[] options = {};
	
	//���𰸵ķ���
	public boolean checkAnswer(String[] ans)
	{
		return false;
	}
	//��ӡ��Ŀ������̨
	public void printQues()
	{
		System.out.println("��ţ�"+id+",��ɣ�"+text);
//		for(int i=0;i<options.length;i++)
//		{
//			System.out.println(options[i]);
//		}
		
		//��ǿforѭ��
		for(String str : options)
		{
			System.out.println("\t"+str);
			
		}
		System.out.println();
	}

}
