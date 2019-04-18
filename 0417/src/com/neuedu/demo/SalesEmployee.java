package com.neuedu.demo;

//ColaEmployee 的子类，销售人员，工资由月销售额和提成率决定。
//属性：月销售额、提成率

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
		System.out.println(month+"月工资为："+Salarypermonth);
		return Salarypermonth;
	}
	
	
}
