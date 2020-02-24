package lealaitafea_problem1;

import java.security.SecureRandom;
import java.util.*;

 public class CAI3
 {
	 SecureRandom rand = new SecureRandom();

	 int product;
	 int questionsAnswered;
	 int questionsAnsweredCorrectly;
	 private String unit;
	 
 public void quiz(){
 
 askQuestion(); 
 readResponse();
 } 
  public void readResponse()
 {
	 Scanner input = new Scanner( System.in );
	 int answer; 
	 answer = input.nextInt();

	 while ( answer != -1 )
	 {
		 isAnswerCorrect( answer );	 
		 answer = input.nextInt();
	 
	 }
 
 }
 
 public void askQuestion()
 {
 
 int number1 = rand.nextInt( 10 );
 int number2 = rand.nextInt( 10 );

 product = number1 * number2;
 if ( questionsAnswered <= 9 )
 {
	 System.out.printf( "How much is %d times %d?\n",number1, number2 );
 }
 
 } 
 public String displayCompletionMessage( boolean correct )
  {
	 SecureRandom rand = new SecureRandom();
	 if ( correct )
		 switch ( rand.nextInt( 4 ) )
		 {
		 	case 0:
		 		return( "Very good!" );
 
		 	case 1:
		 		return( "Excellent!" );
 
		 	case 2:
		 		return( "Nice work!" );
 
		 	case 3:
		 		return( "Keep up the good work!" );
		 }
	 	switch ( rand.nextInt( 4 ) )
	 	{
	 		case 0:
	 		   return( "No. Please try again." );

	 		case 1:
	 			return( "Wrong. Try once more." );
	 		case 2:
	 			return( "Don't give up!" );
	  
	 		case 3: default:
	 			return( "No. Keep trying." );
   } 
} 
 public double percentageCorrect()
 {
	return (double) questionsAnsweredCorrectly/ questionsAnswered;
	 
 }
 public void isAnswerCorrect( int answer )
 {
	 questionsAnswered++;
	 if ( answer != product )
	 displayInorrectResponse();
 else
 {
	 questionsAnsweredCorrectly++;
	 if ( questionsAnswered < 10 )
	 displayCorrectResponse();
 } 
	 if ( questionsAnswered >= 10 )
		  {
		  if (percentageCorrect() > 0.75)
			  System.out.println( "Congratulations, you are ready to go to the next level!");
		  if ( percentageCorrect() < 0.75 )
		  System.out.println( "Please ask your instructor for extra help." );			  
		  questionsAnswered = 0;
		  questionsAnsweredCorrectly = 0;
		  Scanner input = new Scanner(System.in); 
			 System.out.println( "Would you like to try a new set of problems? (yes or no)");
			 unit = input.nextLine();
			 if(unit.equals("yes"))
			 {
				 askQuestion();
			 }
			 else if (unit.equals("no"))
			 {
				 System.out.println( "Exiting");
				 System. exit(0);
			 }
		  }
	
	 
 }
 public void displayCorrectResponse()
 {
	 System.out.println( displayCompletionMessage( true ));	 
	 askQuestion();
 } 
 public void displayInorrectResponse()
 {
	 System.out.println( displayCompletionMessage( false ));
	 askQuestion();
 }
 public static void main( String args[] )
 {
 CAI3 app = new CAI3();
 app.quiz();
 } 
 } 