package com.bayviewglen.dayfive;
import java.util.Scanner;


public class HomeworkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter a three digit number: ");
		int number = keyboard.nextInt(); 
		int digit1 = number % 10;
		int digit3 = number / 100;
		int digit2 = number % 100 / 10;
		
		System.out.println("The sum of the numbers " + digit3 + ", " + digit2 + " and " + digit1 + " is " + (digit1 + digit2 + digit3));
		
		keyboard.close();
	}

}
