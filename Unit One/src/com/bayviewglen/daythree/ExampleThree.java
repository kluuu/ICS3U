package com.bayviewglen.daythree;

public class ExampleThree {

	public static void main(String[] args) {
		
		int a = 7, b = 3; 
		int c; 
		
		double d = 2.1, e = 3.7;
		double f; 

		c = a * b;
		System.out.println(c);

		f = d*e;
		System.out.println(f);
		
		f = d/e;
		System.out.println(f);
		
		c = a/b; 
		System.out.println(c); 
		
		f = a/b;  	//if both operators are ints then it performs integer division
		System.out.println(f);
		
		f = a/d; 
		System.out.println(f);
	}

}
