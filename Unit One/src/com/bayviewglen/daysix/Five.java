package com.bayviewglen.daysix;
/*
 * the 1927 New York Yankees won 110 games and lost 44. compute their winning percentage and
 *  print it rounded */
public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wins = 110;
		int losses = 44;
		
		double winningPercentage = (double)wins / (wins + losses);
		double winningPercentageRounded = (int)(winningPercentage * 1000)/1000.0;
		
		System.out.println("The 1927 New York Yankees had a winning percentage of " + winningPercentageRounded);

	}

}
