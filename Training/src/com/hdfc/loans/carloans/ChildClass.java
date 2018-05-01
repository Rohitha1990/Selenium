package com.hdfc.loans.carloans;

public class ChildClass extends FirstAbstract
{
	
	public static void main(String[] args) 
	{
		
		ChildClass obj=new ChildClass();
		obj.m2();
		obj.m1();

	}

	@Override
	public void m2() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hi i am m2 overriden method in ChildClass");
	}

}
