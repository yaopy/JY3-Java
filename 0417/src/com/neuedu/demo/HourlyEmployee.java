package com.neuedu.demo;

//ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����
//ÿ�¹�������160 Сʱ�Ĳ��ְ���1.5�����ʷ��š�
//���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��

public class HourlyEmployee extends ColaEmployee{

	public HourlyEmployee(int workHous)
	{
		this.workHous = workHous;
	}
	
	int workHous;
	public int getpermonthSalary(int month) {
		
		if(workHous <= 160) 
		{
			Salarypermonth = workHous*50;
			System.out.println(month+"�¹���Ϊ��"+Salarypermonth);
			return Salarypermonth;
		}else
		{
			Salarypermonth = 8000 + (workHous-160)*75;
			System.out.println(month+"�¹���Ϊ��"+Salarypermonth);
			return Salarypermonth;
		}
	}
}
