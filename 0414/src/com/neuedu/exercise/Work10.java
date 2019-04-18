package com.neuedu.exercise;

import java.util.Scanner;

// 求数字的阶乘
public class Work10 {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入数字");
			int num = scanner.nextInt();
			System.out.println();
		}
		public static int factorial(int n) 
		{
			if(n==0||n==1) 
			{
				return 1;
			}else {
				return factorial(n-1)*n;
			}
		}
}
