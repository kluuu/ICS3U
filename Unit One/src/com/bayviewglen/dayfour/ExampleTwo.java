package com.bayviewglen.dayfour;

public class ExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age1 = 16, age2 = 17, age3 = 16;
		
		//int averageAge = (age1 + age2 + age3) / 3; 
		//double averageAge = (age1+age2+age3) /(double)3;
		//double averageAge = (double) (age1+age2+age3) /3;
		double averageAge = (int) ((double) (age1+age2+age3) /3);
		
		//implicit Cast - last line had 1 - it happened when we assigned the int to the double
		//Explicit Cast - last line we need two explicit casts - 
		
		System.out.println(averageAge); 
	}

}
