package com.neuedu.exercise;

import java.util.Scanner;
//����̨�������ƽ������
public class Work11 {
		
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������");
		int num = scanner.nextInt();
		if(num%2!=0) {
			System.out.println("ƽ��");
		}else {
			System.out.println("����");
		}
		}

//		public static int  year(int n) {	
//			
//			if(n%4==0) 
//			{
//				System.out.println("����");
//			
//			}else {
//				System.out.println("ƽ��");
//			}
//			
//			return n;
//		}
}
