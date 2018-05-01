package com.hdfc.loans.homeloans;



public class A 
{
	static int nr=100,dr=10,result;
	
	public static void m1() throws Exception
	{
		result=nr/dr;
		System.out.println(result);
		
	}

	public static void main(String[] args)
	{
		try 
		{
			m1();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
