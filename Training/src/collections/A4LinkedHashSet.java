package collections;

import java.util.LinkedHashSet;

public class A4LinkedHashSet 
{

	public static void main(String[] args)
	{

		LinkedHashSet<String> h= new LinkedHashSet<String>();
		
		h.add("Oracle");
		h.add("Oaktech");
		h.add("bigscreens");
		h.add("Oracle");
		h.add("Okaridge");
		System.out.println(h);

		

	}

}
