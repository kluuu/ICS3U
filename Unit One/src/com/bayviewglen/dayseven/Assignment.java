package com.bayviewglen.dayseven;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		
		
		System.out.print("please enter the height of shallow end: "); 
		double h1 = in.nextDouble(); 
		
		System.out.print("please enter the length of the full pool: "); 
		double l = in.nextDouble(); 
		
		System.out.print("please enter the width of the pool: "); 
		double w = in.nextDouble(); 
		
		System.out.print("please enter the height of deep end: "); 
		double h2 = in.nextDouble(); 
		
		System.out.print("please enter the length of deep end: "); 
		double l1 = in.nextDouble(); 
		
		System.out.print("please enter the length of shallow end: "); 
		double l2 = in.nextDouble(); 
		
		// Volume: 
		
		double Volume1 = h1 * l * w;
		double Volume2 = (h1-h2) * l1 * w; 
		double Volume3 = (( (h2-h1) * (l-l1-l2) )/ 2 ) * w; 
		
		double totalVolume = Volume1 + Volume2 + Volume3; 
		
		//Surface area: 
		
		double side1 = h1 * l * 2; 
		double ends1 = w * h1 * 2; 
		
		
		
		
	}
}
