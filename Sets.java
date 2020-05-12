package setsandMaps;
import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {

     Set<String>set1 = new HashSet<String>();
     
     set1.add("Durga Prasad");
     set1.add("Prameela");
     set1.add("Aashritha");
     set1.add("Lathik");
     
     System.out.println(set1);
     
     for(String element : set1) {
    	 System.out.println(element);
     }
     
     if(set1.contains("Lathik")) {
    	 System.out.println("Contains Lathik");
     }
     
     Set<String>set2 = new HashSet<String>();
     
     set2.add("Durga Prasad");
     set2.add("Prameela");
     set2.add("Surya Prakash");
     set2.add("Raghava");
     
     System.out.println(set2);
     
     Set<String> intersection = new HashSet<String>(set1);
          intersection.retainAll(set2);
          System.out.println(intersection);
          
     Set<String> difference = new HashSet<String>(set1);
     	  difference.removeAll(set2);
     	  System.out.println(difference);
     
	}

}
