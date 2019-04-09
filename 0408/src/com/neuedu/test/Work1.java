package com.neuedu.test;

public class Work1 {
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.name = "JAVA起源";
		b1.page = 999;
		b1.price = 0;
		b1.author = "yaopy";
		b1.ISBN = 0;
		b1.publish = "hethl";
		System.out.println("b1的书名为："+b1.name);
		System.out.println("b1的页数为："+b1.page);
		System.out.println("b1的价格为："+b1.price);
		System.out.println("b1的作者为："+b1.author);
		System.out.println("b1的编号为："+b1.ISBN);
		System.out.println("b1的出版社为："+b1.publish);
		
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
		System.out.println("正在看书..");
	}
	public void preserved() 
	{
		System.out.println("收藏家..");
	}
	
}
