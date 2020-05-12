package tutorial1;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter the Value: ");
		int value = scanner.nextInt();
		
	    while(value !=5) {
	    	System.out.println("Enter the value: ");
	    	value = scanner.nextInt();
	    }
	    */
		int value = 0;
		do
		{
			System.out.println("Enter the Value: ");
		    value = scanner.nextInt();
		}
		 while(value !=5); 
		System.out.println("result Obtained as 5!");
	}

}
