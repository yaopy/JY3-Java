package com.neuedu.demo;

public class SingleQuesTest {

	public static void main(String[] args) {
		String[] options = new String[] {
				"���»�","������","�¹�ϣ","��˼��"
		};
		SingleQues sq = new SingleQues(1,"��������˧������˭��",options,"��˼��");
		String[] ans = new String[] {
				"���»�"
		};
		boolean checkAnswer = sq.checkAnswer(ans);
		sq.printQues();
		System.out.println(checkAnswer==true?"�����":"�����");
	
	}
}
