package com.neuedu.Polymophsim;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Test {

	public static void main(String[] args) {
		
		//向上转型
		//父类类型 变量名 = 子类
		
//		ColorfulPrinter colorfulPrinter = new ColorfulPrinter();
//		colorfulPrinter.print();
//		BlackandWhitePrinter blackandWhitePrinter = new BlackandWhitePrinter();
//		blackandWhitePrinter.print();
		
		
		//父类引用指向子类的实例
		//赋值多态   另一种  传参多态
		Printer p1 = new ColorfulPrinter();
		p1.print();
		Printer p2 = new BlackandWhitePrinter();
		p2.print();
		
		//引用数据类型    数组  class
	}
}


//			类内    包内     子类       任意
//public     *	   *     *      *
//protected  *	   *     * 
//default    *	   *
//private    *
