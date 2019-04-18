package com.neuedu.plus;

public class Student{
	public Student(int id,String stuName,char stuSex,short stuAge,String stuGrade,String stuAddress,int stuTel,String stuEmail){
		this.id=id;
		this.stuName=stuName;
		this.stuSex=stuSex;
		this.stuAge=stuAge;
		this.stuGrade=stuGrade;
		this.stuAddress=stuAddress;
		this.stuTel=stuTel;
		this.stuEmail=stuEmail;
	}
	
	
	
	@Override
	public String toString() {
		return "Student (id=" + id + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + ")";
	}



	int id;
	String stuName;
	char stuSex;
	short stuAge;
	String stuGrade;
	String stuAddress;
	int stuTel;
	String stuEmail;
}
