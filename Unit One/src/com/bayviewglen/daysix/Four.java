package com.bayviewglen.daysix;
/*
 * Light travels as 3*10^8 meters per second. Compute and print the distance 
 * that a light beam would travel in one year. (This is called a light year)
 */
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int seconds = 60;
		int minutes = 60; 
		int hours = 24;
		int days = 365; 
		
		double lightyear = seconds * minutes * hours * days * (3* Math.pow(10,8));
		
		System.out.println("A light beam would travel " + lightyear + " meters in one year.");
	}

}
