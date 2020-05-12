package tutorial1;

import java.util.Scanner;

public class SWITCH {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your command: ");
		String text = input.nextLine();
		switch(text) {
		
		case "start":
			System.out.println("Engine started");
		break;
		
		case "stop": 
			System.out.println("Engine Stopped");
		break;
		
		default:
			System.out.println("command executed not recognized");
			
		}

	}

}
