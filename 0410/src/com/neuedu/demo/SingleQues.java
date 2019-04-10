package com.neuedu.demo;

public class SingleQues extends Question{
	//标答
	String answer;
	public SingleQues()
	{
		
	}
	
	//构造器
	//构建了一个题
	public SingleQues (int id,String text,String[] ops,String answer) 
	{
		this.id = id;
		this.text = text;
		this.options = ops;
		this.answer = answer;
	}
	@Override
	public boolean checkAnswer(String[] ans) {
		if(ans == null || ans.length !=1)
		{
			return false;	
		}else
		{
			return this.answer.equals(ans[0]);
		}
		
	}
}
