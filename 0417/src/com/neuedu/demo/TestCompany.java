package com.neuedu.demo;

import java.util.Arrays;

//��main�����������ɸ������͵�Ա������һ��ColaEmployee �����
//����Ԫ��������ÿ��Ա�����µĹ��ʡ�
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
		//����getSalary������ʹ��������ı���permonthsalary��ʵ���в���ʹ�ã���������
		//permonthsalary��ǿ����0����
		//��Ҫ�ﵽЧ�������෽��Ӧ��getsalay������Ϊgetbounus��
		//����company������ͬʱ����������Ա��getpermonthsalary�����͸����е�getbonus����
	}
}
