package com.neuedu.exercise;

public class Work4 {
	public static void main(String[] args) {
		int i=1;
		int num = 0;
		while(i<=100) 
		{
			if(i%2!=0) 
			{
			num+=i;
			}
			i++;
		}
		System.out.println(num);
	}
}
