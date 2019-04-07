import java.util.*;
public class tongjizifu
{
	public static void main(String[] args)
	{
		String str = "统计一个字符在字符中的所有位置";
		char a = '字';
		for(int i =0;i < str.length();i++)
		{
			char z = str.charAt(i);
			if(z == a)
			{
				System.out.println(i);
				//break;
			}
		}
	
	}
	
}