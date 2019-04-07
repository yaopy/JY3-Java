public class Test08
{
	public static void main(String[] args)
	{
		String str = "692116851128";
		//System.out.print(str.length());
		int oddNum = 0,evenNum = 0;
		for(int i=0;i<str.length();i=i+2)
		{
			char c1 = str.charAt(i);
			oddNum=oddNum+(int)c1-48;
		}
		//System.out.println(oddNum);
		for(int i=1;i<str.length();i=i+2)
		{
			char c2 = str.charAt(i);
			evenNum=evenNum+(int)c2-48;
		}
		
		//System.out.println(evenNum);
		int count = oddNum +evenNum*3;
		int cot = count%10;
		int lastnum = (10-cot)%10;
		System.out.println(lastnum);
	}
}