package com.neuedu.demo;


//字符串常用API
public class StringDemo {

	public static void main(String[] args) {
		//方法
		String str = "hello";
		System.out.println(str.length());
		//属性
		String[] strs = {"1","2"};
		System.out.println(strs.length);
		
		
		
		//charAt(int index)   取出某位置元素
		char charAt = str.charAt(0);
		System.out.println(charAt);
		
		
		//substring()      从某位置开始到某处结束输出其中元素
		//用于身份证号截取出生年月
		String subString = str.substring(0,2);
		System.out.println(subString);
		
		
		//compareTo    相等返回0，前面大返回正数，后面大返回负数
		String str2 = "ABC";
		String str3 = "BCD";
		int compareTO = str2.compareTo(str3);
		System.out.println(compareTO);
	
	
		//concat     拼接字符串
		String concat =str2.concat(str3);
		System.out.println(concat);
	
		//indexOf   根据字符找索引
		String str4 = "neuedu";
		int indexOf = str4.indexOf("e");
		int indexOf1 = str4.indexOf("e",2); //从第二个位置开始
		System.out.println(indexOf);
		System.out.println(indexOf1);
		String str5 = "neuedue";
		int lastindexOf = str5.lastIndexOf("e");
		System.out.println(lastindexOf);
	
	
		//UpperCase转大写和LowCase转小写
		String upperCase = str5.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = str5.toLowerCase();
		System.out.println(lowerCase);
	
	
		//replace   替换
		String str6 = "neusofte";
		String replace = str6.replace('o', 'l');//replaceAll
		System.out.println(replace);
		String replaceFirst = str6.replaceFirst("o", "l");//传字符串
		System.out.println(replaceFirst);
		
		
		//trim       去除空格
		String str7 = "       456       ";
		String trim = str7.trim();
		System.out.println(str7);
		System.out.println(trim);
		
		
		//startsWith   endsWith   判断是否以什么开头以什么结尾
		String str8 = "www.baidu.com";
		boolean startsWith = str8.startsWith("www");
		System.out.println(startsWith);
		boolean endsWith = str8.endsWith("co");
		System.out.println(endsWith);
		
		
		//contains   判断字符串中是否包含某部分字符串
		String str9 = "i love china";
		boolean contains = str9.contains("love");
		System.out.println(contains);
		
		
		//split    切割数据，将字符串切割后用数组存放，用下标表示的位置表示切割后的字符串部分
		String str10 = "1,张三,18,天津,津D888";
		String[] split = str10.split(",");
		System.out.println(split[4]);
	
		
		//equals equalsIgnoreCase    比较数据不区分大小写
		String stril11 = "CSDN";
		String stril12 = "csdn";
		System.out.println(stril11.equals(stril12));
		System.out.println(stril11.equalsIgnoreCase(stril12));
		
		
		//把数组转成string类型  但是会转成ASCALL码  （GBK）
		byte[] bs = new byte[] {65,66};
		String string = new String(bs);
		System.out.println(string);
		
		
		//将其他类型转化为字符串
		String valueOf = String.valueOf(1.5);
		System.out.println(valueOf);
	}
	
}
