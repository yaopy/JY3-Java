package com.neuedu.demo;

import java.util.Arrays;

//在main方法，把若干各种类型的员工放在一个ColaEmployee 数组里，
//并单元出数组中每个员工当月的工资。
public class TestCompany {

	public static void main(String[] args) {
		
		SalariedEmployee salariedEmployee1 = new SalariedEmployee(6);
		salariedEmployee1.EmployeeName = "tom";
		salariedEmployee1.EmployeeBirthday = 1.20;
		
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee(6);
		hourlyEmployee1.EmployeeName = "mike";
		hourlyEmployee1.EmployeeBirthday = 6.20;
		hourlyEmployee1.workHous = 150;
		
		SalesEmployee SalesEmployee1 = new SalesEmployee(600,0.5);
		SalesEmployee1.EmployeeName = "nancy";
		SalesEmployee1.EmployeeBirthday = 3.20;
		
		
		ColaEmployee[] ColaEmployee = {salariedEmployee1,hourlyEmployee1,SalesEmployee1};
		System.out.println(Arrays.toString(ColaEmployee));
	
		System.out.println(SalesEmployee1.getSalary(6));
		//父类getSalary方法中使用了子类的变量permonthsalary，实际中不可使用，故输出结果
		//permonthsalary被强制以0计算
		//若要达到效果，父类方法应将getsalay方法改为getbounus，
		//再在company方法中同时调用子类型员工getpermonthsalary方法和父类中的getbonus方法
	}
}
