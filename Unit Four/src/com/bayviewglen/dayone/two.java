/*
 * Example: For Loop without an if statement.
 * 
 * Write a program that will sum all of numbers between two numbers that the user enters.
 * 
 */
package com.bayviewglen.dayone;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Two numbers please: ");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		int low, high;
		if (x > y){
			low = y;
			high = x;
		}else{
			low = x;
			high = y;
		}
		
		int sum = 0;
		for(int i = low; i<=high; i++){
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
