package lealaitafea_problem1;

import java.security.SecureRandom;
import java.util.*;

 public class CAI4
 {
	 SecureRandom rand = new SecureRandom();

	 int product;
	 int questionsAnswered;
	 int questionsAnsweredCorrectly;
	 int difficultyLevel;
	 
	 private String unit;
	 
	 
 
 public void readDifficulty()
 {
 Scanner difficultyInput = new Scanner( System.in );
 System.out.println( "Enter difficulty 1, 2, 3, or 4" );
 difficultyLevel = difficultyInput.nextInt();
 
 }
 public void quiz()
 {
 readDifficulty();
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
  public void generateQuestionArgument()
 {
	  int limit = 0;
	  if ( difficultyLevel == 1 )
	 	 limit = 10;
	  else if ( difficultyLevel == 2 )
	 	 limit = 100;
	  else if ( difficultyLevel == 3 )
	 	 limit = 1000;
	  else if ( difficultyLevel == 4 )
	 	 limit = 10000;
	  int number1 = rand.nextInt( limit );
	  int number2 = rand.nextInt( limit );

	  product = number1 * number2;
	  if ( questionsAnswered <= 9 )
	  {
	 	 System.out.printf( "How much is %d times %d?\n",number1, number2 );
	  }
 }
 
  public void askQuestion()
 {

	  generateQuestionArgument();
 
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
				 Scanner difficultyReset = new Scanner( System.in );
				 System.out.println( "Enter difficulty 1, 2, 3, or 4" );
				 difficultyLevel = difficultyReset.nextInt();
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
 CAI4 app = new CAI4();
 app.quiz();
 } 
 } 