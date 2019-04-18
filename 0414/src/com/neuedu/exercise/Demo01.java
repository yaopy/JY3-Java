package com.neuedu.exercise;

import java.util.Scanner;

public class Demo01 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("输入数字");
			int num = scanner.nextInt();
			 Demo01 nums = new Demo01();
			 nums.abc(num);
			
		}
		public void abc(int a) {
			if(a%2==0) {
				System.out.println("偶数");
			}else {
				System.out.println("奇数");
			}
			
		}
		
		
	
	
}
