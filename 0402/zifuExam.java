import java.util.*;
public  class zifuExam{
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入要转换的字符：");
	String num = scanner.next();
	char specialChar = num.charAt(0);
	int result = getCharToInt(specialChar);
	System.out.print("转换后的字符为："+result);
}
	public static char getCharToInt(char c){
		
		return c;
	}
	}
