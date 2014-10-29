package com.bayviewglen.daysix;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: ");
		double number = keyboard.nextDouble();
		
		double square = number * number;
		double squareRoot = Math.sqrt(number);
		
		System.out.println("The number " + number + " squared is " + square);
		System.out.println("The number " + number + " square rooted is " + squareRoot);
		
		keyboard.close();
	}

}
