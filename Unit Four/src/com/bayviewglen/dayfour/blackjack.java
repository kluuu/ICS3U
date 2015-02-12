package com.bayviewglen.dayfour;

import java.util.Locale;
import java.util.Scanner;

public class blackjack {

	private static final String CANADA = null;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Locale locale = null;
		// name
		System.out.println("Please enter your name: ");
		String name = keyboard.nextLine();

		boolean betvalid = false;

		while (!betvalid) {

			System.out.println("How much do you want to bet? You have $500 in the bank.");

			// bet

			String bet = keyboard.nextLine();
			int bet$ = Integer.parseInt(bet);
			if (bet$ < 0 || bet$ > 500) {
				System.out.println("Please bet within $500");

			}
			else
				betvalid = true;

		}
		
		

		int AC = 1;
		int twoC = 2;
		int threeC = 3;
		int fourC = 4;
		int fiveC = 5;
		int sixC = 6;
		int sevenC = 7;
		int eightC = 8;
		int nineC = 9;
		int tenC = 10;
		int JC = 11;
		int QC = 12;
		int KC = 13;

		// diamonds
		int AD = 1;
		int twoD = 2;
		int threeD = 3;
		int fourD = 4;
		int fiveD = 5;
		int sixD = 6;
		int sevenD = 7;
		int eightD = 8;
		int nineD = 9;
		int tenD = 10;
		int JD = 11;
		int QD = 12;
		int KD = 13;

		// hearts
		int AH = 1;
		int twoH = 2;
		int threeH = 3;
		int fourH = 4;
		int fiveH = 5;
		int sixH = 6;
		int sevenH = 7;
		int eightH = 8;
		int nineH = 9;
		int tenH = 10;
		int JH = 11;
		int QH = 12;
		int KH = 13;

		// Spades
		int AS = 1;
		int twoS = 2;
		int threeS = 3;
		int fourS = 4;
		int fiveS = 5;
		int sixS = 6;
		int sevenS = 7;
		int eightS = 8;
		int nineS = 9;
		int tenS = 10;
		int JS = 11;
		int QS = 12;
		int KS = 13;

		int start = 500;

		int randomcards = (int) ((Math.random() * 13) + 1);
		int randomSuit = (int) ((Math.random() * 4) + 1);

		System.out.println("Player:  " + Math.random()*randomcards + Math.random()*randomSuit);
		System.out.println("Dealer:  " + Math.random()*randomcards + Math.random()*randomSuit +"  "+ Math.random()*randomcards + Math.random()*randomSuit);
		
		System.out.println("What do you want to do? 1. Stay 2. Hit. "); 
		String hit = keyboard.nextLine();
		int hit1 = Integer.parseInt(hit);
		if(hit1 == 2){ 
			System.out.println("Player:  " + Math.random()*randomcards + Math.random()*randomSuit +"  "+ Math.random()*randomcards + Math.random()*randomSuit + Math.random()*randomcards + Math.random()*randomSuit); 
		}
		
		else { 
			hit1 = (int) (Math.random()*2); 
			while(hit1 == 2){ 	
				System.out.println("Dealer:  " + Math.random()*randomcards + Math.random()*randomSuit +"  "+ Math.random()*randomcards + Math.random()*randomSuit + Math.random()*randomcards + Math.random()*randomSuit); 
			} 
			while(hit1 == 1){ 
				System.out.println("Dealer:  " + Math.random()*randomcards + Math.random()*randomSuit +"  "+ Math.random()*randomcards + Math.random()*randomSuit);
			}
			
			
			
			}
		}

		String card = ""; 
		// get suit
		if (randomcards == 1) {
			card += "A";
		} else if (randomcards == 2) {
			card += "2";
		} else if (randomcards == 3) {
			card += "3";
		} else if (randomcards == 4) {
			card += "4";
		} else if (randomcards == 5) {
			card += "5";
		} else if (randomcards == 6) {
			card += "6";
		} else if (randomcards == 7) {
			card += "7";
		} else if (randomcards == 8) {
			card += "8";
		} else if (randomcards == 9) {
			card += "9";
		} else if (randomcards == 10) {
			card += "10";
		} else if (randomcards == 11) {
			card += "J";
		} else if (randomcards == 12) {
			card += "Q";
		} else if (randomcards == 13) {
			card += "K";
		}

		if (randomSuit == 1) {
			card += "H";
		}
		if (randomSuit == 1) {
			card += "S";
		}
		if (randomSuit == 1) {
			card += "D";
		}
		if (randomSuit == 1) {
			card += "C";
		}

		boolean done = false;
		while (!done) {
			int wallet = 500;
			String name = getUserName();
			locale = getLocale(keyboard);
			int bet = getBet(wallet);
		}
}
	}

	private static int getBet(int wallet) {
		// TODO Auto-generated method stub
		return 0;
	}

	private String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void Locale getLocale() {
		Scanner keyboard = new Scanner(System.in); 
		Locale locale = null;
		boolean valid = false;
		while (!valid) {
			// country
			System.out.println("Please enter the number of your location: ");
			System.out.println("1. Canada");
			System.out.println("2. United States");
			System.out.println("3. Italy");
			System.out.println("4. Germany");
			System.out.println("5. Monaco");
			String country = keyboard.nextLine();

			int loc = Integer.parseInt(country);

			if (loc == 1) {
				locale = Locale.CANADA;
				System.out.println("You have selected the " + locale + " locale.");
				valid = true;
			} else if (loc == 2) {
				locale = Locale.US;
				System.out.println("You have selected the " + locale + " locale.");
				valid = true;
			} else if (loc == 4) {
				locale = Locale.ITALY;
				System.out.println("You have selected the " + locale + " locale.");
				valid = true;
			} else if (loc == 4) {
				locale = Locale.GERMANY;
				System.out.println("You have selected the " + locale + " locale.");
				valid = true;
			} else if (loc == 5) {
				locale = Locale.JAPAN;
				System.out.println("You have selected the " + locale + " locale.");
				valid = true;
			} else {
				System.out.println("Please select a country in the list.");
			}
		}

		return locale;

	}

	

}