package com.neuedu.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Work12 {

	
		public static void main(String[] args) {
			int[] array= new int[] {
					5,8,7,9,6,4,1,2
			};
			Work12 num = new Work12();
			num.bubble(array);
			System.out.println(Arrays.toString(array));
		}
		public int[] bubble(int[] nums) {
			
			for(int i=0;i<nums.length-1;i++) 
			{
				for(int j=0;j<nums.length-i-1;j++) 
				{
					if(nums[j]>nums[j+1]) 
					{
						int temp = 0;
						temp = nums[j];
						nums[j]= nums[j+1];
						nums[j+1] = temp;
					}
				}
			}
			
			return nums;
		}
}
