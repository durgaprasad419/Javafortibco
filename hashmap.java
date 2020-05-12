package setsandMaps;
import java.util.HashMap;import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		
	
		map.put(4, "Four");
		map.put(6, "Six");
		map.put(9, "Nine");
		map.put(7, "Seven");
		map.put(2, "Two");
		
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
	

	}

}
