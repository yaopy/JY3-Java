import java.util.*;
public class chengji
{
	public static void main(String[] args){
	//第五题
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入成绩：");
	int score = scanner.nextInt();
	if (score > 100 || score < 0)
	{
	System.out.println("super man");}
	else if (score >= 90 && score <= 100)
	{
	System.out.println("优秀");
	}
	else if (score >= 80 && score < 90 )
	{
	System.out.println("良好");
	}
	else if (score < 80 )
	{
	System.out.println("不及格");
	}
	}
}