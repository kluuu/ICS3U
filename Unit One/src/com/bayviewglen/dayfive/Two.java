package com.bayviewglen.dayfive;
import java.util.Scanner;

/*
 * Declaring a Scanner to read input from the Keyboard.
 * 
 * Reading double data.
 * 
 * Calculate the Surface Area of a box.  
 * 
 * You must prompt the user of the length and width of the base and the height of the box - these can have a decimal.
 * 
 * You can assume the box has a lid.
 */


public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		double length, height, width; 
		
		System.out.print("please enter the width of the box: "); 
		width = in.nextDouble(); 
		
		System.out.print("please enter the height of the box: "); 
		height = in.nextDouble(); 
		
		System.out.print("please enter the length of the box: "); 
		length = in.nextDouble(); 
		
		double surfaceArea = (2*length*width) + (2*length*height) + (2*width*height);
		
		System.out.println("The surface area of a box with (width, length, height) of (" + width + ", " + length + ", " + height + ") is " + surfaceArea); 
	}

}
