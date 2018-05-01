package collections;

import java.util.HashSet;

public class A3HashSet 
{

	public static void main(String[] args)
	{
		HashSet<String> h= new HashSet<String>();
		
		h.add("Oracle");
		h.add("Oaktech");
		h.add("bigscreens");
		h.add("Oracle");
		h.add("Okaridge");
		System.out.println(h);

		

	}

}
