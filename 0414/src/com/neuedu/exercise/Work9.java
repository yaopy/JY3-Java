package com.neuedu.exercise;

import java.util.Arrays;

//�ҵ�һ����������ֵ���±�
	//�����趨���ֵΪ�±�Ϊ0�ģ�����������бȽ���������� �Ͱ�ֵ������
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

		
		
		

