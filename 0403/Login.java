import java.util.*;
public class Login{
public static void main(String[] args)
{	//创建键盘输入的对象
	Scanner scanner = new Scanner(System.in);
	//定义初始化用户名和密码
	char userName = 'a';
	char passWord = 'c';
	System.out.println("请输入您的账号：");
	//接收键盘输入的第一个字符串
	String inputUser = scanner.next();
	System.out.println("请输入您的密码：");
	//接收键盘输入的第二个字符
	String inputPsw = scanner.next();
	//根据索引取出字符串中第一个字符
	char c1 = inputUser.charAt(0);
	char c2 = inputPsw.charAt(0);
	if(userName == c1 && passWord == c2)
	{
		System.out.print("登录Success...");
	}
	
}
}