package com.hdfc.loans.carloans;

public class KOTACK implements RBI {

	@Override
	public void withdrawl() {
		
		System.out.println("Hi i am overiden withdrwal method in KOTACK");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		KOTACK obj=new KOTACK();
		obj.withdrawl();
	}

}
