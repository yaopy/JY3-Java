public class ArrayDemo
{
	public static void main(String[] args)
	{
		//创建数组,特点（连续、下标从0开始、一旦编译不可更改）
		/*
			默认值
			int 0
			boolean false
			char '\u0000'
			double	0.0
		*/
		int[] nums = new int[5];
		nums[0] =5;
		nums[1] =15;
		//String区别 .length();
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
		}
	}
}