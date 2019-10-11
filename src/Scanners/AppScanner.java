package Scanners;

import java.util.Scanner;

public class AppScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Always close scanners, only use 1 for everything.

		Scanner scan  = new Scanner(System.in);
		System.out.println("enter next line string");
		String input = scan.nextLine();
		System.out.println("input was: "  + input);
		scan.close();
		
		
		
		
		
	}

}
