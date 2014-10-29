package com.bayviewglen.daysix;
/* 
 * Find and print the area and perimeter of a rectangle that is 4.5 feet long and 2.3 
 * feet wide. print both rounded to the nearest tenth of a foot.
 */
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double length = 4.5;
		double width = 2.3; 
		
		double area = (length * width) - ((length * width) % 0.1); 
		double perimeter = (length * 2) + (width * 2);
		
		System.out.println("The area of the rectangle is " + area + " square feet.");
		System.out.println("The perimeter of the rectangle is " + perimeter + " feet.");
	}

}
