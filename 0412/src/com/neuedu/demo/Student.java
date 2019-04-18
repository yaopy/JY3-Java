package com.neuedu.demo;

//学生类  属性(ID 姓名  性别  年龄  年级   地址  联系方式   邮箱)
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
