package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap3 
{

	public static void main(String[] args)
	{
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("Rohi", 100);
		map.put("Div", 100);
		map.put("Anu", 10);
		map.put("yeshu", 4);
		map.put("Anu", 10);
		System.out.println(map);

	}

}
