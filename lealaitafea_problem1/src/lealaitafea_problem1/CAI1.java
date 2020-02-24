package lealaitafea_problem1;

import java.security.SecureRandom;
import java.util.*;

 public class CAI1
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
	 System.out.println( "Very Good!" );	 
	 System. exit(0);
	  } 
 public void displayInorrectResponse()
 {
	 System.out.println( "No. Please try again." );
 } 
 public static void main( String args[] )
 {
 CAI1 app = new CAI1();
 app.quiz();
 } 
 } 
 