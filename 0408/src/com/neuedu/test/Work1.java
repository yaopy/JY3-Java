package com.neuedu.test;

public class Work1 {
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.name = "JAVA��Դ";
		b1.page = 999;
		b1.price = 0;
		b1.author = "yaopy";
		b1.ISBN = 0;
		b1.publish = "hethl";
		System.out.println("b1������Ϊ��"+b1.name);
		System.out.println("b1��ҳ��Ϊ��"+b1.page);
		System.out.println("b1�ļ۸�Ϊ��"+b1.price);
		System.out.println("b1������Ϊ��"+b1.author);
		System.out.println("b1�ı��Ϊ��"+b1.ISBN);
		System.out.println("b1�ĳ�����Ϊ��"+b1.publish);
		
	}
	

}
class Book{
	String name;
	int page;
	int price;
	String author;
	int ISBN;
	String publish;
	
	public void read() 
	{
		System.out.println("���ڿ���..");
	}
	public void preserved() 
	{
		System.out.println("�ղؼ�..");
	}
	
}
