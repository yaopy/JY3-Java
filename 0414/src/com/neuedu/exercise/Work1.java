package com.neuedu.exercise;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字");
		int x = scanner.nextInt();
		if(x%2==0) 
		{
			System.out.println("输入的数值是偶数");
		}else {
			System.out.print("输入的数值是"+x);
		}
	}
	
	
	
	
}
