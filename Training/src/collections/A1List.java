package collections;

import java.util.ArrayList;

public class A1List
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		
		a.add(10);
		a.add("Rohitha");
		a.add(10.34f);
		a.add(10);
		a.add(20);
		
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.get(4));



	}

}
