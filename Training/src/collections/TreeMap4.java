package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap4 
{

	public static void main(String[] args) 
	{
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1,"Rohi");
		map.put(2,"Anu");
		map.put(4,"Div");
		map.put(1,"Neil");
		map.put(5,"Madhu");
		map.put(3,"Sai");
		System.out.println(map);
	

	}

}
