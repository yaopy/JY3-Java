package com.neuedu.demo;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//����һ��User�Ķ���
		User user = new User();
		//����һ�����ܼ�������Ķ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = scanner.next();
		System.out.println("���������룺");
		String psw = scanner.next();
		//���ü���û��ķ���
		boolean checkUser = user.checkUser(username,psw);
		System.out.println(checkUser == true ? "��¼�ɹ�":"��¼ʧ��");
		//�رտ���̨����
		scanner.close();
	}
}
