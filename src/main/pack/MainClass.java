package main.pack;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner Reader = new Scanner(System.in);
		
		System.out.println("========== SELECT A NUMBER: 1, 2 OR 3 ==========");
		String Read = Reader.nextLine();
		System.out.println("Selected Number: " + Read);
		
		try {
			
		switch(Read) {
		case "1":
			Write("The selected number is " + Read);
			break;
			
		case "2":
			Write("The selected number is " + Read);
			break;
			
		case "3":
			Write("The selected number is " + Read);
			break;
			
		default:
			Write("This number is not an option.");
			main(null);
			break;	
		}
		
		} catch(Exception e) {
			
			Write("I don't know what is this");
			
		}
		
		Write("Type anything and press enter to reset the application.");
		
		@SuppressWarnings("unused")
		String NL = Reader.next();
		
		Reader.close();
		
		main(null);
	}
	
	static void Write(String args) {
		System.out.println(args);
	}

}
