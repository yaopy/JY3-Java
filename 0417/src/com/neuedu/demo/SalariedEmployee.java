package com.neuedu.demo;

//SalariedEmployee ��ColaEmployee �����࣬�ù̶����ʵ�Ա����
//���ԣ���н

public class SalariedEmployee extends ColaEmployee{

	public SalariedEmployee()
	{
		
	}
	public SalariedEmployee(int Salarypermonth)
	{
		this.Salarypermonth = Salarypermonth;
	}
	
	
	
	
	public int getpermonthSalary(int month) {
		System.out.println(month+"�¹���Ϊ��"+Salarypermonth);
		return Salarypermonth;
	}
}
