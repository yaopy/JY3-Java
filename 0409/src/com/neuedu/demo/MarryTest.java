package com.neuedu.demo;

public class MarryTest {

	public static void main(String[] args) {
		Person girl = new Person("tj123789","凤姐",'女',(short)25,false,"123456197101026543","湖南","1234567893",null);
		Person boy = new Person("tj123456","张家辉",'男',(short)22,false,"123456197101021234","香港","1234567895",null);
		boy.anotherPerson = girl;
		girl.anotherPerson = boy;
		boolean marry = boy.marry(girl);
		System.out.println(marry == true? "恭喜您，喜结良缘":"下回再见");
		System.out.println("张家辉的婚否状态："+boy.isMarry);
		System.out.println("凤姐的婚否状态："+girl.isMarry);
		System.out.println("张家辉的伴侣名字："+boy.anotherPerson.pName);
		System.out.println("凤姐的伴侣名字："+girl.anotherPerson.pName);
		
		
	}
}
