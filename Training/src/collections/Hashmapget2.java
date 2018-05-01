package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmapget2
{

	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Div", 10);
		map.put("Rohi", 200);
		map.put("yeshu", 30);
		map.put("Anu", 100);
		System.out.println(map.get("Rohi"));
		System.out.println(map.get("Anu"));
		System.out.println(map.get("Div"));
		

	}

}
