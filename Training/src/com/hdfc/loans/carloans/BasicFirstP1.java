package com.hdfc.loans.carloans;



public class BasicFirstP1 implements FirstInterface{
		int a=10,b=20,c;//properties//
	
	public void additions()//concurrent behaviours//
	{
		c=a+b;
		System.out.println("The Result of Addition is :"+c);
	}
	
	public static void main(String[] args) 
	{
		
		//classname reference= new classname//
		BasicFirstP1 obj=new BasicFirstP1();//state or object//
		obj.additions();
		
		
		obj.m1();
		
		BasicFirstP1 obj1=new BasicFirstP1();
		obj1.additions();
		
		
		// TODO Auto-generated method stub
		System.out.println("This is my Basic First Program in Java");
	}

	@Override
	public void m1()
	{
		
		System.out.println("Hi i am m1 override method in BasicFirstP1");
		// TODO Auto-generated method stub
		
	}

}
