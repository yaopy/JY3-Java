package com.neuedu.demo;

//ѧ����  ����(ID ����  �Ա�  ����  �꼶   ��ַ  ��ϵ��ʽ   ����)
public class Student {

	public Student(int id,String name,char stuSex,short stuAge,String stuGrade,String address,int tel,String email)
	{
		this.id =id;
		this.stuName =name;
		this.stuSex =stuSex;
		this.stuAge =stuAge;
		this.stuGrade =stuGrade;
		this.stuAddress =address;
		this.stuTel =tel;
		this.stuEmail =email;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + "]";
	}



	int id;
	String stuName;
	char stuSex;
	short stuAge;
	String stuGrade;
	String stuAddress;
	int stuTel ;
	String stuEmail;

	
	
	
	
	
	
	
	
	
	
	
}
