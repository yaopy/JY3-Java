package com.neuedu.exercise;

import java.util.Scanner;

public class Work2 {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������x��ֵ");
		int x = scanner.nextInt();
		System.out.println("������y��ֵ");
		int y = scanner.nextInt();
		if(x>y) 
		{
			System.out.println("���ֵ��"+x);
		}else 
		{
			System.out.println("���ֵ��"+y);
		}
	}
}
