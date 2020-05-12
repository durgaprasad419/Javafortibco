package tutorial1;

public class ArraysString {

	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "Durga";
		words[2] = "Prasad";
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		
		String[] fruits = { "Apple", "Banana", "Orange" , "Pineapple" , "Mango"};
		
	    for(String fruit: fruits) {
	    	System.out.println(fruit);
	    }
	}

}
