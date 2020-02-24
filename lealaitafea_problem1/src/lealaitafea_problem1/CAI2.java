package lealaitafea_problem1;

import java.security.SecureRandom;
import java.util.*;

 public class CAI2
 {
	 SecureRandom rand = new SecureRandom();

	 int product; 

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
 System.out.printf( "How much is %d times %d?\n",number1, number2 );
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
  
 public void isAnswerCorrect( int answer )
 {
 if ( answer != product )
	 displayInorrectResponse();
 else
 {
	 displayCorrectResponse();
 } 
 }
 public void displayCorrectResponse()
 {
	 System.out.println( displayCompletionMessage( true ));	 
	 System. exit(0);
	  } 
 public void displayInorrectResponse()
 {
	 System.out.println( displayCompletionMessage( false ));
 } 
 public static void main( String args[] )
 {
 CAI2 app = new CAI2();
 app.quiz();
 } 
 } 