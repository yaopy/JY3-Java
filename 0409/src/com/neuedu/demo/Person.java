package com.neuedu.demo;

public class Person {
	//�޲ι��췽��
	public Person()
	{
		
	}
	public Person(String pNo,String pName,
			char pSex,short pAge,boolean isMarry,String pId,String pAddress,String pTelphone,Person anotherPerson)
	{
		this.pNo = pNo;
		this.pName = pName;
		this. pSex =  pSex;
		this.pAge = pAge;
		this.isMarry = isMarry;
		this.pId = pId;
		this.pAddress = pAddress;
		this.pTelphone = pTelphone;
		this.anotherPerson = anotherPerson;
	}
	
	String pNo;
	String pName;
	char pSex;
	short pAge;
	boolean isMarry;
	String pId;
	String pAddress;
	String pTelphone;
	Person anotherPerson;
	//���
	public boolean marry(Person aPerson) 
	{
		MarryHouse marryHouse = new MarryHouse();
		boolean marryRules = marryHouse.marryRules(this,aPerson );
		return marryRules;
		
	}
}
