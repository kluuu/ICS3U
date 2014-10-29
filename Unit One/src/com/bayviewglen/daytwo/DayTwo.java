package com.bayviewglen.daytwo;

public class DayTwo {

	public static void main(String[] args) {
		//the quote " is special so i must use the backslash to escape it
		System.out.println("This is not a problem");
		
		System.out.println("A backslash is special \\see");
		//escaped the backslash because it has purpose
		
		System.out.println("This\nis\na\nnew\nline!"); 
		// /n does new line
		
		//Variable: store information/values (specify the type of data we are going to store
		//int - Integer    double - decimal
		
		int numberOne, numberTwo; //naming convention for variable is camelCase. (no space allowed, upper case for every word after the first word)
		int sum;
		
		numberOne = 7; 
		numberTwo = 23; 
		
		//numberOne is assigned "7", not equal 7. (numberOne = 7) 
		
		//7 = numberOne; the left hand side of an assignment must be a variable
		sum = numberOne + numberTwo; 
		
		System.out.println(sum);
		
		System.out.println(numberOne + "+" + numberTwo + "=" + sum);
		// to join strings together is to concatenate  (string concatenation) USE + "" + 
		
		
		

	}

}
