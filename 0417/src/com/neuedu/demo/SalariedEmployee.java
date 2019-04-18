package com.neuedu.demo;

//SalariedEmployee ：ColaEmployee 的子类，拿固定工资的员工。
//属性：月薪

public class SalariedEmployee extends ColaEmployee{

	public SalariedEmployee()
	{
		
	}
	public SalariedEmployee(int Salarypermonth)
	{
		this.Salarypermonth = Salarypermonth;
	}
	
	
	
	
	public int getpermonthSalary(int month) {
		System.out.println(month+"月工资为："+Salarypermonth);
		return Salarypermonth;
	}
}
