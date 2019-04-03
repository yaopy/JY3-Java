import java.util.*;
public class charDemo{

public static void main(String[] args)
{
	for(int i=0;i<100;i++)
	{
		Random random = new Random();
		int num = random.nextInt(26);
		char c = (char)('A'+num);
		System.out.print(c);
	}
}
}