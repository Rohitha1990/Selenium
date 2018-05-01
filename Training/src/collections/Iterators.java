package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterators 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> v=new ArrayList<Integer>();
	for(int i=1; i<=10; i++)
	{
		v.add(i);
	}
	System.out.println(v);
	
	Iterator<Integer> ele = v.iterator();
	while(ele.hasNext())
	{
		Integer val = ele.next();
		if(val%2==0)
			System.out.println(val);
		else ele.remove();
	}
	System.out.println(v);

		

	}

}
