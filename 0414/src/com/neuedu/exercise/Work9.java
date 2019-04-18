package com.neuedu.exercise;

import java.util.Arrays;

//找到一个数组的最大值和下标
	//方法设定最大值为下标为0的，遍历数组进行比较如果大于它 就把值赋给它
public class Work9 {
	public static void main(String[] args) {
		int[] arr = new int[] {
			18,25,7,36,13,2,89,63
		};
		  int max = getMax(arr);
		  
		System.out.println(max);
		
		}
		public static int getMax(int[] arr) {
			int max = arr[0];
			for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]>max) 
				{
					int temp = arr[i];
					arr[i]=max;
					max=temp;
				}
						
					}
			return max;
		}
			
}

		
		
		

