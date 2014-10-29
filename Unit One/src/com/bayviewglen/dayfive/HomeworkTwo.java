package com.bayviewglen.dayfive;
import java.util.Scanner;

/* 
 * 2.	Create a program that obtains two integers, one for the amount a 
 * test is out of and another indicating what a student received. Display
 *  what percentage the student received on the test.
 */
public class HomeworkTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the mark that the student got: ");
		
		double studentmark = keyboard.nextInt(); 
		
		System.out.print("Please enter the mark that the test is out of: ");
		double testoutof = keyboard.nextInt();
		
		double Mark = (studentmark / testoutof) * 100;
		
		System.out.println("The student's mark is: " + studentmark + " out of " + testoutof  + " which the personatage is " + Mark +"%"); 
		keyboard.close();
	}

}
