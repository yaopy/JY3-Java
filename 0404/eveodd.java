public class eveodd
{
	public static void main(String[] args)
	{
		String str = "123456789012";

		int oddNum = 0,evenNum = 0;
		for(int i=0;i<str.length();i=i+2)
		{
			char c1 = str.charAt(i);
			oddNum=oddNum+(int)c1-48;
		}
		System.out.println(oddNum);
		for(int i=1;i<str.length();i=i+2)
		{
			char c2 = str.charAt(i);
			evenNum=evenNum+(int)c2-48;
		}
		System.out.println(evenNum);
		}
		}