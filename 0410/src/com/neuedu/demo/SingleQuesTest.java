package com.neuedu.demo;

public class SingleQuesTest {

	public static void main(String[] args) {
		String[] options = new String[] {
				"刘德华","吴彦祖","陈冠希","王思聪"
		};
		SingleQues sq = new SingleQues(1,"世界上最帅的人是谁？",options,"王思聪");
		String[] ans = new String[] {
				"刘德华"
		};
		boolean checkAnswer = sq.checkAnswer(ans);
		sq.printQues();
		System.out.println(checkAnswer==true?"答对了":"答错了");
	
	}
}
