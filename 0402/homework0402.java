import java.util.*;
public  class homework0402{
public static void main(String[] args){
	//第二、三题
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入要计算的值：");
	int x = scanner.nextInt();
	System.out.println("计算后得："+f1(x));
	System.out.println("计算后得："+f2(x));
	System.out.println("计算后得："+f3(x));
	
	//第八题
	//Scanner scanner = new Scanner(System.in);
	//System.out.print("请输入验证码条码：");
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