package com.neuedu.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		int parseInt = Integer.parseInt("451");
		System.out.println(parseInt);
		//int a = 5;
		//自动装箱   
		//引用数据类型转为基本数据类型  Integer a = new Integer(5);
		Integer a = 5;
		
		//自动装箱
		//int b = new Integer(10).intValue();
		int b = new Integer(10);
	
		//定义成绩，可用包装类，他比基本数据类型有更多功能。可以表示更多数
		Integer score1 = null ;  //缺考
		Integer score2 = 0;      //零分
	}
	
}
