package com.neuedu.demo;

//���� ���� ����
//����̳и������Ժͷ���
//���������ܼ̳�
//ʵ���������ݹ�������и���ռ�
//���๹����һ�����ø��๹����
//��һ���й����������ࡢ���ࣩ


public class Animal {

	public Animal()
	{
		System.out.println("���๹����");
	}
	
	String animalName;
	String animalType;
	int weight;
	public void run()
	{
		System.out.println("������..");
	}
}
//�̳�
class Dog extends Animal
{
	public void sys()
	{
		System.out.println(animalName);
	}
}
class ErHa extends Dog
{
	
}