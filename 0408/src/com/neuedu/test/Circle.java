package com.neuedu.test;

import java.util.Scanner;

public class Circle
{
	
	int[] p;
	double r;
	private int[] ps;
	public Circle()
	{
		int [] p= {3,4};
		r = 2;
	}

	public void size() 
	{
		double s = 3.14*Math.pow(r, 2);
		System.out.println(s);
	}
	public void distence() 
	{	
		int p[] = {1,2} ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�жϵĵ��x���꣺");
		int a = scanner.nextInt();
		p [0] =  a;
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("������Ҫ�жϵĵ��y���꣺");
		int b = scanner1.nextInt();
		 p [1] = b;
		double d = Math.sqrt(Math.pow(p[0]-0, 2)+Math.pow( p[1]-0, 2));
		if(d <= r) {
			System.out.println("����Բ��");
		}else {
			System.out.println("����Բ��");
		}
	}
	public static void main(String[] args) 
	{
		Circle yuan = new Circle() ;
		{
			yuan.size();
			yuan.distence();
		}
	}
}
