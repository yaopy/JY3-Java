import java.util.*;
public class ExitCirculation
{
	public static void main(String[] args)
	{
		while( true)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("您输入的数是：");
			int num = scanner.nextInt();
			if (num==-1)
		{
			break;
		}
		System.out.println(num);
		}
	}
}