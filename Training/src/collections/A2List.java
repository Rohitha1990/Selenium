package collections;

import java.util.ArrayList;
import java.util.List;

public class A2List
{

	public static void main(String[] args) 
	{
		List<Object> a=new ArrayList<Object>();
		
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
