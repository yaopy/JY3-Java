public class ArrayDemo
{
	public static void main(String[] args)
	{
		//��������,�ص㣨�������±��0��ʼ��һ�����벻�ɸ��ģ�
		/*
			Ĭ��ֵ
			int 0
			boolean false
			char '\u0000'
			double	0.0
		*/
		int[] nums = new int[5];
		nums[0] =5;
		nums[1] =15;
		//String���� .length();
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}
	}
}