package com.neuedu.exercise;

import java.util.Scanner;

public class Demo01 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("��������");
			int num = scanner.nextInt();
			 Demo01 nums = new Demo01();
			 nums.abc(num);
			
		}
		public void abc(int a) {
			if(a%2==0) {
				System.out.println("ż��");
			}else {
				System.out.println("����");
			}
			
		}
		
		
	
	
}
