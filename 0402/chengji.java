import java.util.*;
public class chengji
{
	public static void main(String[] args){
	//������
	Scanner scanner = new Scanner(System.in);
	System.out.print("������ɼ���");
	int score = scanner.nextInt();
	if (score > 100 || score < 0)
	{
	System.out.println("super man");}
	else if (score >= 90 && score <= 100)
	{
	System.out.println("����");
	}
	else if (score >= 80 && score < 90 )
	{
	System.out.println("����");
	}
	else if (score < 80 )
	{
	System.out.println("������");
	}
	}
}