package com.bayviewglen.daysix;
/*
 * compute and print the number of minutes in a year
 */
public class Three {

	public static void main(String[] args) {

		int hoursinaday = 24;
		int minutesinanhour = 60;
		int daysinayear = 365;
		
		int minutes = daysinayear * hoursinaday * minutesinanhour;
		
		System.out.println("There are " + minutes + " minutes in a year.");
		
	}

}
