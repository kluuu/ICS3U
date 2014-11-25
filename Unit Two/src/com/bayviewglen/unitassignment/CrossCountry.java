package com.bayviewglen.unitassignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your first name and last name: ");
		String name = keyboard.nextLine();
		
		System.out.print("Please enter your time to the first mile: ");
		String first  = keyboard.nextLine();
		
		System.out.print("Please enter your time to the end of the second mile: ");
		String second  = keyboard.nextLine();
		
		System.out.print("Please enter your time to complete the 5 kms: ");
		String third  = keyboard.nextLine();
		
		int mile1Minutes = Integer.parseInt(first.substring(0, first.indexOf(":")));
		double mile1Seconds = Double.parseDouble(first.substring(first.indexOf(":")+1));
		int mile1Minutesinseconds = mile1Minutes * 60; 
		double  mile1total = mile1Minutesinseconds + mile1Seconds; 
		
		int mile2Minutes = Integer.parseInt(second.substring(0, second.indexOf(":")));
		double mile2Seconds = Double.parseDouble(second.substring(second.indexOf(":")+1));
		int mile2Minutesinseconds = mile2Minutes * 60; 
		double  mile2total = mile2Minutesinseconds + mile2Seconds; 
		
		int mile3Minutes = Integer.parseInt(third.substring(0, third.indexOf(":")));
		double mile3Seconds = Double.parseDouble(third.substring(third.indexOf(":")+1));
		int mile3Minutesinseconds = mile3Minutes * 60; 
		double  mile3total = mile3Minutesinseconds + mile3Seconds; 
		
		double split2 = mile2total - mile1total; 
		double split3 = mile3total - mile2total; 
		
		int split2min = (int)split2/60;
		double split2sec = split2%60; 
		
		int split3min = (int)split3/60;
		double split3sec = split3%60;
		
		int totalmin = split2min + split3min + mile1Minutes; 
		double totalsec = split2sec + split3min + mile1Seconds; 		
		
		DecimalFormat formatter = new DecimalFormat("######.000");
		
		System.out.println("Runner: " + name);
		System.out.println("Split 1: " + first); 
		System.out.println("Split 2: " + split2min + ":" + formatter.format(split2sec)); 
		System.out.println("Split 3: " + split3min + ":" + formatter.format(split3sec) ); 
		System.out.println("Total seconds: " + totalmin + ":" + formatter.format(totalsec)); 
		
		
		//second player
		
		System.out.print("Please enter your first name and last name: ");
		String name2 = keyboard.nextLine();
		
		System.out.print("Please enter your time to the first mile: ");
		String first2  = keyboard.nextLine();
		
		System.out.print("Please enter your time to the end of the second mile: ");
		String second2  = keyboard.nextLine();
		
		System.out.print("Please enter your time to complete the 5 kms: ");
		String third2  = keyboard.nextLine();
		
		int mile1Minutes2 = Integer.parseInt(first2.substring(0, first2.indexOf(":")));
		double mile1Seconds2 = Double.parseDouble(first2.substring(first2.indexOf(":")+1));
		int mile1Minutesinseconds2 = mile1Minutes2 * 60; 
		double  mile1total2 = mile1Minutesinseconds2 + mile1Seconds2; 
		
		int mile2Minutes2 = Integer.parseInt(second2.substring(0, second2.indexOf(":")));
		double mile2Seconds2 = Double.parseDouble(second2.substring(second2.indexOf(":")+1));
		int mile2Minutesinseconds2 = mile2Minutes2 * 60; 
		double  mile2total2 = mile2Minutesinseconds2 + mile2Seconds2; 
		
		int mile3Minutes2 = Integer.parseInt(third2.substring(0, third2.indexOf(":")));
		double mile3Seconds2 = Double.parseDouble(third.substring(third2.indexOf(":")+1));
		int mile3Minutesinseconds2 = mile3Minutes2 * 60; 
		double  mile3total2 = mile3Minutesinseconds2 + mile3Seconds2; 
		
		double split22 = mile2total2 - mile1total2; 
		double split32= mile3total2 - mile2total2; 
		
		int split2min2 = (int)split22/60;
		double split2sec2 = split22%60; 
		
		int split3min2 = (int)split32/60;
		double split3sec2 = split32%60;
		
		int totalmin2 = split2min2 + split3min2 + mile1Minutes2; 
		double totalsec2 = split2sec2 + split3min2 + mile1Seconds2; 		
		
		System.out.println("Runner 2: " + name2);
		System.out.println("Split 1: " + first2); 
		System.out.println("Split 2: " + split2min2 + ":" + formatter.format(split2sec2)); 
		System.out.println("Split 3: " + split3min2 + ":" + formatter.format(split3sec2) ); 
		System.out.println("Total seconds: " + totalmin2 + ":" + formatter.format(totalsec2));
		
		//third player
		
				System.out.print("Please enter your first name and last name: ");
				String name3 = keyboard.nextLine();
				
				System.out.print("Please enter your time to the first mile: ");
				String first3  = keyboard.nextLine();
				
				System.out.print("Please enter your time to the end of the second mile: ");
				String second3  = keyboard.nextLine();
				
				System.out.print("Please enter your time to complete the 5 kms: ");
				String third3  = keyboard.nextLine();
				
				int mile1Minutes3 = Integer.parseInt(first3.substring(0, first3.indexOf(":")));
				double mile1Seconds3 = Double.parseDouble(first3.substring(first3.indexOf(":")+1));
				int mile1Minutesinseconds3 = mile1Minutes3 * 60; 
				double  mile1total3 = mile1Minutesinseconds3 + mile1Seconds3; 
				
				int mile2Minutes3 = Integer.parseInt(second3.substring(0, second3.indexOf(":")));
				double mile2Seconds3 = Double.parseDouble(second3.substring(second3.indexOf(":")+1));
				int mile2Minutesinseconds3 = mile2Minutes3* 60; 
				double  mile2total3 = mile2Minutesinseconds3 + mile2Seconds3; 
				
				int mile3Minutes3 = Integer.parseInt(third2.substring(0, third2.indexOf(":")));
				double mile3Seconds3 = Double.parseDouble(third.substring(third2.indexOf(":")+1));
				int mile3Minutesinseconds3 = mile3Minutes2 * 60; 
				double  mile3total3 = mile3Minutesinseconds3 + mile3Seconds3; 
				
				double split23 = mile2total3 - mile1total3; 
				double split33= mile3total3 - mile2total3; 
				
				int split2min3 = (int)split23/60;
				double split2sec3 = split23%60; 
				
				int split3min3 = (int)split33/60;
				double split3sec3 = split33%60;
				
				int totalmin3 = split2min3 + split3min3 + mile1Minutes3; 
				double totalsec3 = split2sec3 + split3min3 + mile1Seconds3; 		
				
				System.out.println("Runner 3: " + name3);
				System.out.println("Split 1: " + first3); 
				System.out.println("Split 2: " + split2min3 + ":" + formatter.format(split2sec3)); 
				System.out.println("Split 3: " + split3min3 + ":" + formatter.format(split3sec3)); 
				System.out.println("Total seconds: " + totalmin3 + ":" + formatter.format(totalsec3));
				
		
		
		
		
	}

}
