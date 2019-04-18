package com.neuedu.Polymophsim;

public class Person {
	public static void main(String[] args) {
	
		Person person = new Person();
		Train train = new Train();
		person.play(train);
	}

	
	//Íæ
	public void play(Vehicle v)
	{
		v.trip();
	}
	
}
