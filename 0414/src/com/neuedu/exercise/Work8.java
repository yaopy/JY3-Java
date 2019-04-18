package com.neuedu.exercise;

import java.util.Arrays;

public class Work8 {

		public static void main(String[] args) {
			int[] arry = new int[] {
					1,6,2,3,9,4,5,7,8
			};
			
			for(int i=0;i<arry.length-1;i++) 
			{
				for(int j=0; j<arry.length-1-i;j++) 
				{
					if(arry[j]>arry[j+1]) 
					{
						int temp = 0;
					 temp = arry[j];
					 arry[j]= arry[j+1];
					 arry[j+1]=temp;
					}
				}
				
			}
			System.out.println(Arrays.toString(arry));
		}
}
