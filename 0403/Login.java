import java.util.*;
public class Login{
public static void main(String[] args)
{	//������������Ķ���
	Scanner scanner = new Scanner(System.in);
	//�����ʼ���û���������
	char userName = 'a';
	char passWord = 'c';
	System.out.println("�����������˺ţ�");
	//���ռ�������ĵ�һ���ַ���
	String inputUser = scanner.next();
	System.out.println("�������������룺");
	//���ռ�������ĵڶ����ַ�
	String inputPsw = scanner.next();
	//��������ȡ���ַ����е�һ���ַ�
	char c1 = inputUser.charAt(0);
	char c2 = inputPsw.charAt(0);
	if(userName == c1 && passWord == c2)
	{
		System.out.print("��¼Success...");
	}
	
}
}