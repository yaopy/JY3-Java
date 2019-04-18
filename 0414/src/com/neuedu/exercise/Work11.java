package com.neuedu.exercise;

import java.util.Scanner;
//控制台输入计算平年闰年
public class Work11 {
		
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入年");
		int num = scanner.nextInt();
		if(num%2!=0) {
			System.out.println("平年");
		}else {
			System.out.println("闰年");
		}
		}

//		public static int  year(int n) {	
//			
//			if(n%4==0) 
//			{
//				System.out.println("闰年");
//			
//			}else {
//				System.out.println("平年");
//			}
//			
//			return n;
//		}
}
