package lealaitafea_problem2;

public class SavingsAccountTest{
	 
    
    public static void main(String[] args) {
      
        
       SavingsAccount saver1=new SavingsAccount(2000);
       SavingsAccount saver2=new SavingsAccount(3000);
        
       SavingsAccount.modifyInterestRate(0.04);
       
    	   System.out.println("-----------------------------------------------");
    	   System.out.println(" Saver 1 at 4 Percent");
    	   System.out.println("-----------------------------------------------");
    	   for(int month = 1; month < 13; month++)
    	   {
    		   saver1.calculateMonthlyInterest();
       		   saver1.displaySavings();
    		 
    	   }
    	   System.out.println("-----------------------------------------------");
    	   System.out.println(" Saver 1 at 5 Percent");
    	   System.out.println("-----------------------------------------------");
    	   for(int month = 1; month < 13; month++)
    	   {
    		   saver1.calculateMonthlyInterest();
       		   saver1.displaySavings();
    		 
    	   }
       
    	   
       SavingsAccount.modifyInterestRate(0.05);      
    	   System.out.println("-----------------------------------------------");
    	   System.out.println(" Saver 2 at 4 Percent");
    	   System.out.println("-----------------------------------------------");
    	   for(int month = 1; month < 13; month++)
    	   {
       	       saver2.calculateMonthlyInterest();
    		   saver2.displaySavings();
    	   }
    	   System.out.println("-----------------------------------------------");
    	   System.out.println(" Saver 2 at 5 Percent");
    	   System.out.println("-----------------------------------------------");
    	   for(int month = 1; month < 13; month++)
    	   {
       	       saver2.calculateMonthlyInterest();
    		   saver2.displaySavings();
    	   }
    
    
    
    }
}
     

