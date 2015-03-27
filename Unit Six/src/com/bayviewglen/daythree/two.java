package com.bayviewglen.daythree;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = {{10,11,12,13},
				{14,15,16,17},
				{18,19,20,21},
				{22,23,24,25},
				{26,27,28,29}}; 
		
		for (int row=0; row!=5; row++)   {
		    for (int col=0; col!=4; col++)   {
			System.out.println( numbers[row][col] );
		    }
		}

		for (int col=0; col!=4; col++)   {
		    for (int row=0; row!=5; row++)   {
			System.out.println( numbers[row][col] );
		    }
		}

		
		
		
		}
	}

