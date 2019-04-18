package com.neuedu.demo;


//�ַ�������API
public class StringDemo {

	public static void main(String[] args) {
		//����
		String str = "hello";
		System.out.println(str.length());
		//����
		String[] strs = {"1","2"};
		System.out.println(strs.length);
		
		
		
		//charAt(int index)   ȡ��ĳλ��Ԫ��
		char charAt = str.charAt(0);
		System.out.println(charAt);
		
		
		//substring()      ��ĳλ�ÿ�ʼ��ĳ�������������Ԫ��
		//�������֤�Ž�ȡ��������
		String subString = str.substring(0,2);
		System.out.println(subString);
		
		
		//compareTo    ��ȷ���0��ǰ��󷵻�����������󷵻ظ���
		String str2 = "ABC";
		String str3 = "BCD";
		int compareTO = str2.compareTo(str3);
		System.out.println(compareTO);
	
	
		//concat     ƴ���ַ���
		String concat =str2.concat(str3);
		System.out.println(concat);
	
		//indexOf   �����ַ�������
		String str4 = "neuedu";
		int indexOf = str4.indexOf("e");
		int indexOf1 = str4.indexOf("e",2); //�ӵڶ���λ�ÿ�ʼ
		System.out.println(indexOf);
		System.out.println(indexOf1);
		String str5 = "neuedue";
		int lastindexOf = str5.lastIndexOf("e");
		System.out.println(lastindexOf);
	
	
		//UpperCaseת��д��LowCaseתСд
		String upperCase = str5.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = str5.toLowerCase();
		System.out.println(lowerCase);
	
	
		//replace   �滻
		String str6 = "neusofte";
		String replace = str6.replace('o', 'l');//replaceAll
		System.out.println(replace);
		String replaceFirst = str6.replaceFirst("o", "l");//���ַ���
		System.out.println(replaceFirst);
		
		
		//trim       ȥ���ո�
		String str7 = "       456       ";
		String trim = str7.trim();
		System.out.println(str7);
		System.out.println(trim);
		
		
		//startsWith   endsWith   �ж��Ƿ���ʲô��ͷ��ʲô��β
		String str8 = "www.baidu.com";
		boolean startsWith = str8.startsWith("www");
		System.out.println(startsWith);
		boolean endsWith = str8.endsWith("co");
		System.out.println(endsWith);
		
		
		//contains   �ж��ַ������Ƿ����ĳ�����ַ���
		String str9 = "i love china";
		boolean contains = str9.contains("love");
		System.out.println(contains);
		
		
		//split    �и����ݣ����ַ����и���������ţ����±��ʾ��λ�ñ�ʾ�и����ַ�������
		String str10 = "1,����,18,���,��D888";
		String[] split = str10.split(",");
		System.out.println(split[4]);
	
		
		//equals equalsIgnoreCase    �Ƚ����ݲ����ִ�Сд
		String stril11 = "CSDN";
		String stril12 = "csdn";
		System.out.println(stril11.equals(stril12));
		System.out.println(stril11.equalsIgnoreCase(stril12));
		
		
		//������ת��string����  ���ǻ�ת��ASCALL��  ��GBK��
		byte[] bs = new byte[] {65,66};
		String string = new String(bs);
		System.out.println(string);
		
		
		//����������ת��Ϊ�ַ���
		String valueOf = String.valueOf(1.5);
		System.out.println(valueOf);
	}
	
}
