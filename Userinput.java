package tutorial1;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt for data
		System.out.println("Enter input line of text: ");
		
		// Wait for user to enter some text
		String line = input.nextLine();
		
		// tell them what you entered
		System.out.println("You entered text: " + line);
		
	}

}
