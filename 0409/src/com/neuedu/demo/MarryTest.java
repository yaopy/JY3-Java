package com.neuedu.demo;

public class MarryTest {

	public static void main(String[] args) {
		Person girl = new Person("tj123789","���",'Ů',(short)25,false,"123456197101026543","����","1234567893",null);
		Person boy = new Person("tj123456","�żһ�",'��',(short)22,false,"123456197101021234","���","1234567895",null);
		boy.anotherPerson = girl;
		girl.anotherPerson = boy;
		boolean marry = boy.marry(girl);
		System.out.println(marry == true? "��ϲ����ϲ����Ե":"�»��ټ�");
		System.out.println("�żһԵĻ��״̬��"+boy.isMarry);
		System.out.println("���Ļ��״̬��"+girl.isMarry);
		System.out.println("�żһԵİ������֣�"+boy.anotherPerson.pName);
		System.out.println("���İ������֣�"+girl.anotherPerson.pName);
		
		
	}
}
