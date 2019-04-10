package com.neuedu.demo;
//选择题


public class Question {

	//题号
	int id;
	//题干
	String text;
	//选项
	String[] options = {};
	
	//检查答案的方法
	public boolean checkAnswer(String[] ans)
	{
		return false;
	}
	//打印题目到控制台
	public void printQues()
	{
		System.out.println("题号："+id+",题干："+text);
//		for(int i=0;i<options.length;i++)
//		{
//			System.out.println(options[i]);
//		}
		
		//增强for循环
		for(String str : options)
		{
			System.out.println("\t"+str);
			
		}
		System.out.println();
	}

}
