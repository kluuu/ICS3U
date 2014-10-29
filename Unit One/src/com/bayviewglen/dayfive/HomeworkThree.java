package com.bayviewglen.dayfive;
/*
 * 3.	Write a program that prompts the user for a five digit number and calculates 
 * the product of the 2nd and 4th digit.
 */

import java.util.Scanner;


public class HomeworkThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a five digit number: ");
		
		int number = keyboard.nextInt(); 
		
		
		int digit2 = number % 100 / 10;
		int digit4 = number % 10000 / 1000; 
		
		
		double Product = digit4*digit2;
		
		System.out.println("The Product of the 2nd and 4th digit of given number: " + number + "is " + Product + ".");
		keyboard.close();
	}

}
