import java.util.*;
public  class homework0402{
public static void main(String[] args){
	//�ڶ�������
	Scanner scanner = new Scanner(System.in);
	System.out.print("������Ҫ�����ֵ��");
	int x = scanner.nextInt();
	System.out.println("�����ã�"+f1(x));
	System.out.println("�����ã�"+f2(x));
	System.out.println("�����ã�"+f3(x));
	
	//�ڰ���
	//Scanner scanner = new Scanner(System.in);
	//System.out.print("��������֤�����룺");
	//String num = scanner.next();
	//char specialChar = num.charAt(0);
	//int result = getCharToInt(specialChar);
	
}
	//public static char getCharToInt(char c){
		
		//return c;
	//}
	  public static int f1(int a){
		int result1 = a*a-2*a+4;  
		return result1;
	  }
	   public static int f2(int a){
		int result2 = a%3;  
		return result2;
	  }
	  public static int f3(int a){
		int result3 = a++;  
		return result3;
	  }
	}