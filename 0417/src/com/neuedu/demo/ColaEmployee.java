package com.neuedu.demo;

//��������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�
//������getSalary(int month) ���ݲ����·���ȷ�����ʣ�
//�������Ա�������գ���˾����⽱��100 Ԫ��


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
			System.out.println(month+"�¹���Ϊ��"+Salarypermonth+100);
			return Salarypermonth+100;
			
		}else
		{
			System.out.println(month+"�¹���Ϊ��"+Salarypermonth);
			return Salarypermonth;
			
		}
		
		
	}
	
	
	
}
