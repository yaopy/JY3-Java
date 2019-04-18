package com.neuedu.demo;

//ColaEmployee 的子类，按小时拿工资的员工，
//每月工作超出160 小时的部分按照1.5倍工资发放。
//属性：每小时的工资、每月工作的小时数

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
			System.out.println(month+"月工资为："+Salarypermonth);
			return Salarypermonth;
		}else
		{
			Salarypermonth = 8000 + (workHous-160)*75;
			System.out.println(month+"月工资为："+Salarypermonth);
			return Salarypermonth;
		}
	}
}
