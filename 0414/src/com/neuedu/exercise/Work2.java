package com.neuedu.exercise;

import java.util.Scanner;

public class Work2 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入x的值");
		int x = scanner.nextInt();
		System.out.println("请输入y的值");
		int y = scanner.nextInt();
		if(x>y) 
		{
			System.out.println("最大值是"+x);
		}else 
		{
			System.out.println("最大值是"+y);
		}
	}
}
