package com.hdfc.loans.carloans;

public class ICICI implements RBI {

	@Override
	public void withdrawl() 
	{
		
		System.out.println("Hi i am overiden withdrwal method in ICICI");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) 
	{
		
		ICICI obj=new ICICI();
		obj.withdrawl();
	}

}
