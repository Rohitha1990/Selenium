package com.hdfc.loans.carloans;

public class Construct 
{
	int x,y,z;
	
	public Construct(int x, int y, int z)
	{
		this(x,y);
		this.x=x;
		this.y=y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	public Construct(int x, int y) 
	{
		this();
		this.x=x*100;
		this.y=y*100;
		System.out.println(this.x);
		System.out.println(this.y);
	}
	public Construct() {
		System.out.println("this is default constructor");
	}

	public static void main(String[] args) 
	{
		Construct c1=new Construct(100,200,300);
		System.out.println(c1+"...c1");
		
		Construct c2=new Construct(1000,2000);
		System.out.println(c2+"....c2");
						

	}

}