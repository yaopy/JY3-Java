package com.neuedu.demo;

//ColaEmployee �����࣬������Ա�������������۶������ʾ�����
//���ԣ������۶�����

public class SalesEmployee extends ColaEmployee{

	public SalesEmployee(int salecounts,double bounuscent)
	{
		this.salecounts = salecounts;
		this.bounuscent = bounuscent;
	}
	
	int salecounts;
	double bounuscent;
	
	
	public int getpermonthSalary(int month) {
		
		Salarypermonth = (int) (5000 + salecounts*bounuscent);
		System.out.println(month+"�¹���Ϊ��"+Salarypermonth);
		return Salarypermonth;
	}
	
	
}
