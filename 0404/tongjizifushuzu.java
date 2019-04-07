import java.util.*;
public class tongjizifushuzu
{
	public static void main(String[] args)
	{
		char[] chs={ 
		'统','计','一','个','字','符','在','字','符','中','的','所','有','位','置'
		};
		char a = '字';
		for(int i =0;i < chs.length;i++)
		{
			
			if(chs[i] == a)
			{
				System.out.println(i);
				
			}
		}
	
	}
	
}