import java.util.*;
public class turnaround
{
	public static void main(String[] args)
	{
		char[] chs={ '5','6','1','2','3'};
		char[] a =new char[6];
		int i = 1;
		for(i=1;i<6;i++)
		{
			a[i]=chs[chs.length-i];
			System.out.print(a[i]);
		}
	
	}
	
}