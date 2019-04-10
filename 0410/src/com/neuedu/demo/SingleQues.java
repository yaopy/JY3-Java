package com.neuedu.demo;

public class SingleQues extends Question{
	//���
	String answer;
	public SingleQues()
	{
		
	}
	
	//������
	//������һ����
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
