package com.neuedu.exercise;

import java.util.Scanner;

// �����ֵĽ׳�
public class Work10 {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("����������");
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
