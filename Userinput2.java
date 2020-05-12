package tutorial1;

import java.util.Scanner;

public class Userinput2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Double value: ");
		
		double Mydouble = input.nextDouble();
		
		System.out.println("You entered the value as:  " + Mydouble);
	}

}
