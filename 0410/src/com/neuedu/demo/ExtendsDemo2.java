package com.neuedu.demo;

public class ExtendsDemo2 {
	
	public static void main(String[] args) {
		noteComputer noteComputer = new noteComputer();
		noteComputer.playGame();
	
	}

}

class Computer
{
	String brand;
	String type;
	
	public void playGame()
	{
		System.out.println("Gaming");
	}
	public void playCode()
	{
		System.out.println("Coding");
	}
}
class noteComputer extends Computer
{

//��������д
//	�������п��Ը�����Ҫ�Լ̳и��෽��������д
//	��д���������뱻��д����������ͬ�ķ����������б�ͷ���ֵ����
//	��д��������ʹ�ñȱ���д�����ϸ�ķ���Ȩ��
	@Override
	public void playGame() {
//		super.playGame();
		System.out.println("��߼�Game");
	}
	
	
	//��������
	public void playCode(String name)
	{
		System.out.println(name+"�ô���");
	}
	

}




