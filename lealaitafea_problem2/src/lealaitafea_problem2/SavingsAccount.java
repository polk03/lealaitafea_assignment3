package lealaitafea_problem2;

import java.text.DecimalFormat;

public class SavingsAccount {
		 
	    private static double annuallInterestRate;
	    private double savingsBalance;
	    private double monthlyInterest;
	    DecimalFormat df = new DecimalFormat("0.00");
	    public SavingsAccount(double savingsBalance) {
	        this.savingsBalance = savingsBalance;
	 
	    }
	 
	    public void calculateMonthlyInterest() {
	        this.monthlyInterest = (savingsBalance * annuallInterestRate) / 12;
	    }
	 
	    public static void modifyInterestRate(double interestRate) {
	        annuallInterestRate = interestRate;
	    }
	 
	    private void calculateSavings() {
	        savingsBalance += this.monthlyInterest;
	    }
	 
	    public void displaySavings() {
	        calculateSavings();	        
	        System.out.println( df.format(savingsBalance));
			
	    }
	 
	}