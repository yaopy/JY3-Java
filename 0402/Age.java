import java.util.*;
public class Age{
		public static void main(String args[]){
					int age1=23;
					int age2=25;
					System.out.println(age1+age2);
					System.out.println(Integer.toBinaryString(age1));
					System.out.println(Integer.toOctalString(age1));
					System.out.println(Integer.toHexString(age1));
					long c1=12345678901l;
					float c2=3.1415926f;
					double c3=1234567890.0987654321;
					System.out.println(c1);
					System.out.println(c2);
					System.out.println(c3);
					char c4=97;
					System.out.println(c4);
					char c5='0';
					System.out.println((int)c5);
					String chars="abcdefghigklmnopqrstuvwxyz";
					System.out.println(chars.charAt((int)(Math.random()*26)));
					Scanner scanner = new Scanner(System.in);
					System.out.println("请输入一个数字：");
					int num = scanner.nextInt();
					System.out.println("您输入的值："+num*num);
					double bird = 0.00045;
					double lightYear = 9460500000000.0 * 4.2;
					System.out.println(lightYear / bird);
					double x = 2 * 9.8 *384;
					System.out.println(Math.sqrt(x));
		}
		}