package com.neuedu.demo;

//这是所有员工总的父类，属性：员工的姓名,员工的生日月份。
//方法：getSalary(int month) 根据参数月份来确定工资，
//如果该月员工过生日，则公司会额外奖励100 元。


public class ColaEmployee 
{
	public ColaEmployee()
	{
		
	}
	
	public ColaEmployee(String EmployeeName,Double EmployeeBirthday)
	{
		this.EmployeeName = EmployeeName;
		this.EmployeeBirthday = EmployeeBirthday;
	}
	
	@Override
	public String toString() {
		return "ColaEmployee [EmployeeName=" + EmployeeName + ", EmployeeBirthday=" + EmployeeBirthday
				+ ", Salarypermonth=" + Salarypermonth + "]";
	}

	String EmployeeName;
	double EmployeeBirthday;
	int Salarypermonth;

	public  int getSalary(int month)
	{
	
//		String[] split = EmployeeBirthday.split(".");
//		int monthInt = Integer.parseInt(split[0]);
		int monthInt = (int)EmployeeBirthday;
		if( month==monthInt)
		{
			System.out.println(month+"月工资为："+Salarypermonth+100);
			return Salarypermonth+100;
			
		}else
		{
			System.out.println(month+"月工资为："+Salarypermonth);
			return Salarypermonth;
			
		}
		
		
	}
	
	
	
}
