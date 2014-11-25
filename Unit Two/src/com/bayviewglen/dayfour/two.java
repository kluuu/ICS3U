package com.bayviewglen.dayfour;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter some text: ");
		String input = keyboard.nextLine();
		
		int index = (int)(Math.random() * input.length());
		System.out.println("The random character in the word " + input + " is: " + input.charAt(index));
		
		keyboard.close();
	}

}
