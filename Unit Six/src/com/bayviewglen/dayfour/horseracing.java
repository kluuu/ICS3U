package com.bayviewglen.dayfour;

import java.io.File;
import java.util.Scanner;




public class horseracing {
	
	public static void main (String[] race){
			
		
	}

	private static String[] loadHorses() {
		// TODO Auto-generated method stub
		Scanner horse = new Scanner("input/horseData.dat");
		int numHorses = horse.nextInt();
		String[] horses = new String[numHorses];
		
		for(int i=0; i<numHorses; ++i){
			horses[i] = horse.nextLine();
		}
	    
		horse.close();
		return horses;
		
	}
		
	private static String[] loadplayers() {
		// TODO Auto-generated method stub
		Scanner player = new Scanner("input/playerData.dat");
		int numPlayer = player.nextInt();
		String[] players = new String[numPlayer];
		
		for(int i=0; i<numPlayer; ++i){
			players[i] = player.nextLine();
		}
	    
		player.close();
		return players;
		
		}
	
	private static String[] loadplayerswallet() {
	
		Scanner wallet = new Scanner("input/playerData.dat");
		int numPlayers = player1.nextInt();
		String[] player1 = new String[numPlayers];
		String[] walletmon = new String[numPlayers]; 
		
		for(int j=0; j<numPlayers; ++j){
			player1[j] = player1.nextLine()`````;
		}
	    
		
		}
	
		private static String[] betyn() {
			
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Do you want to make a bet? 1. Yes 2. No. "); 
			String bet = keyboard.nextLine();
			int betyn = Integer.parseInt(bet);
			if(betyn == 1){ 
				System.out.println("Which horse would you like to bet on?");
				String bethorse = keyboard.nextLine(); 
				int bethorses = Integer.parseInt(bethorse);
			}
			
			if(betyn == 2){ 
				System.out.println("Do you want to make a bet? 1. Yes 2. No. ");
					
				}
	
		}
		
		private static int[] betmoneys() {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("How much money would you bet?"); 
			String betmoney = keyboard.nextLine(); 
			int betmoneys = Integer.parseInt(betmoney);
			
			
		}
		
				
		
				private static String[] horseinRace() {
					
					for(int i = 0; i<8; i++){
					int horseinRace = Math.random()*numHorses.length; 

					String[] horsesinRace = new String [horseinRace];
					
				}
	}
			

}
