import java.util.*;
public class tongjizifu
{
	public static void main(String[] args)
	{
		String str = "ͳ��һ���ַ����ַ��е�����λ��";
		char a = '��';
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