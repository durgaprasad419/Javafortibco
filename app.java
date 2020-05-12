package iterate;

import java.util.Iterator;
import java.util.LinkedList;

public class app {
	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("cat");
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lepoard");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()) {
			
			String value = it.next();
			System.out.println(value);
			if(value.equals("cat")) {
				it.remove();
			}
		}
		
		for(String animal: animals) {
			
			System.out.println(animal);
		}
		
		
		
		
	}
}