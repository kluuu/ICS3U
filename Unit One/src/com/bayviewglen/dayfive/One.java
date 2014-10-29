package com.bayviewglen.dayfive;
/*
 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading integer data.
 * 
 * Prompt the user for three different integers and display the average as the three numbers.
 */

import java.util.Scanner;


public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (int) x/y int is only applied to "x" = int / double
		
		/* 
		 * "crunch" + 3 = crunch3
		 */
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter three integers: ");
		
		int number1 = keyboard.nextInt(); //gets the next integer from the queue or buffer
		int number2 = keyboard.nextInt();
		int number3 = keyboard.nextInt();
		
		double average = (number1 + number2 + number3) / 3.0;
		
		System.out.println("The average of the numbers: " + number1 + "," + number2 + " and " +number3 + " is " + average); 
		
		
		
	}

}
