package com.bayviewglen.dayfive;
import java.util.Scanner;

/* 
 * 	Create a program that can be used to calculate the final 
 * velocity of a car given the initial velocity, the acceleration of the 
 * car and the time that has elapsed using the following equation:
v_f= v_i+at

 */
public class HomeworkFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the initial velocity: ");
		int v = keyboard.nextInt(); 
		
		System.out.print("Please enter the the acceleration of the car: ");
		int a = keyboard.nextInt(); 
		
		System.out.print("Please enter the time that has elapsed: ");
		int t = keyboard.nextInt(); 
		
		double vf = v + (a * t);
		System.out.println("Given that the initial velocity is " + v + ", the acceleration of the car is " + a + ", and the time elapsed is " + t + ", The final velocity of the car is: " + vf);
		keyboard.close();
	}

}
