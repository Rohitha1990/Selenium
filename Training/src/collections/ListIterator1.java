package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator1 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("SriRam");
		ll.add("Rohitha");
		ll.add("Java");
		ll.add("Selenium");
		System.out.println(ll);
		
		ListIterator<String> litr=ll.listIterator();
		while(litr.hasNext())
		{
			String s=litr.next();
			if(s.equals("Java"))
				litr.set("Appium");
		}
		System.out.println(ll);
				
		

	}

}
