package project1;

import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Project1Phase1 {

	public static void main(String[] args) throws Exception {
		// Create a crypto money converter that takes your USD and converts the price in the Crypto (ETH, BTC, MIA) and vice versa
		
		//Project Phase 1 - Requirement 1 & 2 - Declare numeric variables and one constant
		final double USD = 1.00;
		final double SATOSHI = 3314;
		final double ETH = 5000;
		final double MIA = .01802841;
		double moneyAmount = 0.0;
		String convToChoice = null;
		String convFromChoice = null;
		double finalMoneyAmount  = 0.0;
		int keepGoing = 0;
		int counter = 0;
		int listofUpcoming = 0;
		
		//Project Phase 3 - Requirement 1 & 2
		String[] coins = new String[5];
		String[] prices = new String[5];
		coinsComingSoon(coins, "file1.txt");
		coinsComingSoon(prices, "file2.txt");
		
		
		//Project Phase 1 - Requirement 3 & 11
		JOptionPane.showMessageDialog(null, "Welcome to Crypto Converter: Programmed By Jaron Pirtle");
		ImageIcon sats = new ImageIcon("BTC.jpg");
		ImageIcon ether = new ImageIcon("ETH.jpg");
		ImageIcon miami = new ImageIcon("MIA.jpg");
		ImageIcon dollar = new ImageIcon("USD.jpg");
		
		do {
		//Project Phase 1 - Requirement 4
		convFromChoice = JOptionPane.showInputDialog("What type of currency are you converting from");
		
		//Project Phase 2 - Requirement 1 & 2 
		while(!convFromChoice.equalsIgnoreCase("eth") && !convFromChoice.equalsIgnoreCase("mia") && !convFromChoice.equalsIgnoreCase("satoshi") && !convFromChoice.equalsIgnoreCase("usd") ) 
		{
			convFromChoice = JOptionPane.showInputDialog("ERROR: CURRENCY UNKOWN - What type of currency will you be converting from");
		}
		
		convToChoice = JOptionPane.showInputDialog("What type of currency are you converting to");
		
		//Project Phase 2 - Requirement 2 
				while(!convToChoice.equalsIgnoreCase("eth") && !convToChoice.equalsIgnoreCase("mia") && !convToChoice.equalsIgnoreCase("satoshi") && !convToChoice.equalsIgnoreCase("usd") ) 
				{
					convToChoice = JOptionPane.showInputDialog("ERROR: CURRENCY UNKOWN - What type of currency will you be converting to");
				}
		
		
			
		//Project Phase 1 - Requirement 5, 6, 8
		//from Satoshis or BTC conversions
		//Project Phase 2 - Requirement 1		
		if(convFromChoice.equalsIgnoreCase("SATOSHI") && convToChoice.equalsIgnoreCase("USD"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much Satoshis do you have"));
			finalMoneyAmount = moneyAmount/SATOSHI; 
			System.out.println("You have: ");
			System.out.printf("%1.2f",finalMoneyAmount);	
			System.out.print(" " + convToChoice.toUpperCase());
			System.out.println(" ");
			JOptionPane.showMessageDialog(null, "","US Dollar", JOptionPane.INFORMATION_MESSAGE, dollar );
		}
		
		else if(convFromChoice.equalsIgnoreCase("SATOSHI") && convToChoice.equalsIgnoreCase("eth"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much Satoshis do you have"));
			finalMoneyAmount = moneyAmount * .00000015; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Ethereum", JOptionPane.INFORMATION_MESSAGE, ether );
		}
		else if(convFromChoice.equalsIgnoreCase("SATOSHI") && convToChoice.equalsIgnoreCase("mia"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much Satoshis do you have"));
			finalMoneyAmount = moneyAmount * .01666667; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Miami Coin", JOptionPane.INFORMATION_MESSAGE, miami );
		}
		
		// from ETH Conversions
		else if(convFromChoice.equalsIgnoreCase("eth") && convToChoice.equalsIgnoreCase("USD"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much ETH do you have"));
			finalMoneyAmount = moneyAmount * ETH; 
			System.out.println("You have: ");
			System.out.printf("%1.2f",finalMoneyAmount);	
			System.out.print(" " + convToChoice.toUpperCase());
			System.out.println(" ");
			JOptionPane.showMessageDialog(null, "","US Dollar", JOptionPane.INFORMATION_MESSAGE, dollar );
		}
		
		else if(convFromChoice.equalsIgnoreCase("eth") && convToChoice.equalsIgnoreCase("SATOSHI"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much ETH do you have"));
			finalMoneyAmount = moneyAmount * 113479; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Bitcoin", JOptionPane.INFORMATION_MESSAGE, sats );
		}
		else if(convFromChoice.equalsIgnoreCase("eth") && convToChoice.equalsIgnoreCase("mia"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much ETH do you have"));
			finalMoneyAmount = moneyAmount * 6798201; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Miami Coin", JOptionPane.INFORMATION_MESSAGE, miami );
		}
		
		//From MIAMI COIN Conversions
		else if(convFromChoice.equalsIgnoreCase("mia") && convToChoice.equalsIgnoreCase("USD"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much MiamiCoin do you have"));
			finalMoneyAmount = moneyAmount * MIA; 
			System.out.println("You have: ");
			System.out.printf("%1.2f",finalMoneyAmount);	
			System.out.print(" " + convToChoice.toUpperCase());
			System.out.println(" ");
			JOptionPane.showMessageDialog(null, "","US Dollar", JOptionPane.INFORMATION_MESSAGE, dollar );
		}
		else if(convFromChoice.equalsIgnoreCase("mia") && convToChoice.equalsIgnoreCase("SATOSHI"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much MiamiCoin do you have"));
			finalMoneyAmount = moneyAmount * 60; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Bitcoin", JOptionPane.INFORMATION_MESSAGE, sats );
		}
		else if(convFromChoice.equalsIgnoreCase("mia") && convToChoice.equalsIgnoreCase("eth"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much MiamiCoin do you have"));
			finalMoneyAmount = moneyAmount * 0.00000881; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Ethereum", JOptionPane.INFORMATION_MESSAGE, ether );
		}
		
		//From USD conversions
		else if(convFromChoice.equalsIgnoreCase("usd") && convToChoice.equalsIgnoreCase("satoshi"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much USD do you have"));
			finalMoneyAmount = moneyAmount * SATOSHI; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Bitcoin", JOptionPane.INFORMATION_MESSAGE, sats );
		}
		else if(convFromChoice.equalsIgnoreCase("usd") && convToChoice.equalsIgnoreCase("eth"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much USD do you have"));
			finalMoneyAmount = moneyAmount * 0.00048713; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			JOptionPane.showMessageDialog(null, "","Ethereum", JOptionPane.INFORMATION_MESSAGE, ether );
		}
		else if(convFromChoice.equalsIgnoreCase("usd") && convToChoice.equalsIgnoreCase("mia"))
		{
			moneyAmount = Integer.parseInt(JOptionPane.showInputDialog("How much USD do you have"));
			finalMoneyAmount = moneyAmount * 55.3491402; 
			System.out.println("You have: " + finalMoneyAmount + " " + convToChoice.toUpperCase() );
			
			//Project Phase 2 - Requirement 6
			JOptionPane.showMessageDialog(null, "","Miami Coin", JOptionPane.INFORMATION_MESSAGE, miami );
		}
		//Project Phase 2 - Requirement 3 & 4
		keepGoing = JOptionPane.showConfirmDialog(null, "Are you finished converting?");
		counter++;
		
		//Project Phase 2 - Requirement 5
		JOptionPane.showMessageDialog(null, "Total number of converts: " + totalAmountofConversions(counter));
		}while(keepGoing == 1);
		
		listofUpcoming = JOptionPane.showConfirmDialog(null, "Would you like to see our list of coins we want to add to this program?");
		
		if(listofUpcoming == 0)
		{
			System.out.println("================================================================================== ");
			for(int i = 0; i < coins.length; i++)
			{
				System.out.println(coins[i] + " - " + prices[i]);
			}
			System.out.println("================================================================================== ");
		}
		System.out.println("If you have any suggestions feel free to email me at jpirt60@gmail.com");
	}//End of main
	
	public static int totalAmountofConversions(int counter)
	{	
		return counter;
	}
	
	//Project Phase 3 - Requirement 3
	public static String[] coinsComingSoon(String[] arraytoLoad, String filename ) throws Exception
	{
		int index = 0;	
		File fileRet = new File(filename);
		Scanner scan = new Scanner(fileRet);
		
		while(scan.hasNext())
		{
			arraytoLoad[index] = scan.nextLine();
			index++;
		}
		
		scan.close();
		return arraytoLoad;
	}

}//end of class
