package com.neuedu.Polymophsim;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class Test {

	public static void main(String[] args) {
		
		//����ת��
		//�������� ������ = ����
		
//		ColorfulPrinter colorfulPrinter = new ColorfulPrinter();
//		colorfulPrinter.print();
//		BlackandWhitePrinter blackandWhitePrinter = new BlackandWhitePrinter();
//		blackandWhitePrinter.print();
		
		
		//��������ָ�������ʵ��
		//��ֵ��̬   ��һ��  ���ζ�̬
		Printer p1 = new ColorfulPrinter();
		p1.print();
		Printer p2 = new BlackandWhitePrinter();
		p2.print();
		
		//������������    ����  class
	}
}


//			����    ����     ����       ����
//public     *	   *     *      *
//protected  *	   *     * 
//default    *	   *
//private    *
