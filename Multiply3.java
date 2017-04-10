/***************************************************************************************
 Babak Adeli                                                                     
 SID#: w1206929                                                                  
 A3                                                                             
 CISP 401                                                                         
 2017 Spring Semester                                                             
                                                                                  
 This is a Java class called Multiply3.  It uses a random object to product two positive 
 integers up to 9 and prompts the user to multiply them for an answer.  
 It stores the question and answerin a two dimensional 100 element array that it returns 
 back to the main application.  It also generates a random response based on how the 
 student answered the question.

 ***************************************************************************************/

//use secure random to create a secure random number
import java.security.SecureRandom;

import java.util.Scanner; //scanner for user input

public class Multiply3 {
	
	int[][] storeQuestions = new int[100][5]; //100 element 2 integer array to store questions
	int firstNum; //int for the first num
	int secondNum; //int for the second num
	int questNum = 0; //start number of questions at zero
	int numCorrect = 0; //start number of correct questions at zero
	
	SecureRandom randomNumbers = new SecureRandom(); //make random numbers secure
	
	

	/* 1. The quiz function is a public function.  
	 * It does not take and return anything.  
	 * It generates interface to ask user to answer multiplication problems, 
	 * and call createQuestion and checkResponse.
	 * */
	
	public void quiz()
	{
		createQuestion(); //call createQuestions to start asking questions
		
	}//end quiz
	
	
	
	
	/* The createQuestion function is a public function.  
	 * It does not take and return anything.  
	 * It generates a new multiplication question.
	 * */
	
	public void createQuestion()
	{
		
		Scanner input = new Scanner(System.in); //scanner to get user input
		
		questNum++; //increment number of questions asked
		firstNum = 1 + randomNumbers.nextInt(9); //generate random one digit number
		secondNum = 1 + randomNumbers.nextInt(9); //generate another random one digit number to multiply by
		
		System.out.println("\nHow much is " + firstNum + " times " + secondNum + "?\nEnter your answer (-1 to exit):"); //ask the question
		int userInput = input.nextInt(); //get the user's answer
		

		//store the questions and the answers into the array
		storeQuestions[questNum][0] = firstNum; 
		storeQuestions[questNum][1] = secondNum;
		storeQuestions[questNum][2] = (firstNum * secondNum);
		storeQuestions[questNum][3] = userInput;
		
		checkResponse(userInput); //call checkresponse
		
		input.close(); //close input
		
		
		
	}//end createQuestion



	
/*
 * The createResponse function is a public function.  
 * It takes a boolean data and return a string.  
 * If it gets a false input it will return “No. Please try again.", “Wrong. Try once more”, or etc.  
 * If it gets a true input is will return “Very good!”, “Excellent!”, or etc.
 * */
	
	public String createResponse(boolean data)
	{
		int randResponse = 1 + randomNumbers.nextInt(4); //generates random number from 1 to 4
		
		String retResponse = "";
		
		if (data == true)  //if the parameter was true
		{
			//switch to generate a response based on the random number generated
			switch (randResponse)
			{
			case 1: 
				retResponse = "Very good!";
				break;
			case 2: 
				retResponse = "Excellent!";
				break;
			case 3: 
				retResponse = "Nice Work!";
				break;
			case 4:
				retResponse = "Keep up the good work!";
				break;
	
			}
			
		}
		
		else //if the parameter was false
		{
			switch (randResponse)
			{
			case 1:
				retResponse = "No. Please try again.";
				break;
			case 2:
				retResponse = "Wrong. Try once more.";
				break;
			case 3:
				retResponse = "Don't give up!";
				break;
			case 4:
				retResponse = "No. Keep trying.";
				break;
			}
		}
		
		
		return retResponse; //return the response
	}//end createResponse
	
	
	
	
	
	/*
	 * The checkResponse function is a public function.  
	 * It takes integer input and does not return anything.  
	 * It checks if the user answered correctly, 
	 * calls the createResponse function to generate response print out, 
	 * and calls the createQuestion function to generate question.
	 * */
	
	public void checkResponse(int input)
	{
		String bounceBack = ""; // string to store the returned response from createResponse
		if ((firstNum * secondNum) == input) //if correct answer
		{
			numCorrect++; //increment numCorrect
			bounceBack = createResponse(true); //get a true response by calling createResponse
			System.out.printf("%s\n\n", bounceBack); //print the response
			createQuestion(); //create another qustion
		}
		
		else if (input == -1) //if the user exits, return
		{
			return;
		}
		
		else
		{
			bounceBack = createResponse(false); //if incorrect answer
			System.out.printf("%s\n", bounceBack); //get a wrong response
			System.out.println("The correct answer is " + (firstNum * secondNum) + ".\n"); //print the response
			createQuestion(); //get another question
		}
		
		
		
	}//end checkResponse
	
	/*
	 * the printQuestionResult function in the Multiply3 class to display all the questions asked and provide the requested result.
	 */
	
	public void printQuestionResult()
	{
		System.out.println("\n\nThe questions generated by the system are:"); //print out the generated questions
		for (int i = 1; i < questNum; i++) //for loop through the array
		{
			System.out.print(storeQuestions[i][0] + " * " + storeQuestions[i][1] + " = " + storeQuestions[i][2]); //print the question and answer
			if (storeQuestions[i][2] != storeQuestions[i][3]) //check if they were wrong
			{
				System.out.print(" Your answer was " + storeQuestions[i][3] + ", which is incorrect."); //correct them if they were wrong
			}
			
			System.out.println(); //aesthetics
		}
		System.out.println("---------------------------------------------------------------\n"); //aesthetics
		
		System.out.println("You got " + (questNum - 1) + " questions and made " + numCorrect + " questions correct."); //tell them how many they got right out the the questions
		
		double nc = numCorrect; //double for number correct
		double qn = questNum; //double for questions
		String retResponse = ""; //string for random response
		int randResponse = 1 + randomNumbers.nextInt(4); //generates random number from 1 to 4
		
		if ((nc/(qn-1)) >= (2.0/3.0) ) //they got two thirds right
		{
			//switch to generate a response based on the random number generated
			switch (randResponse)
			{
			case 1: 
				retResponse = "Very good!";
				break;
			case 2: 
				retResponse = "Excellent!";
				break;
			case 3: 
				retResponse = "Nice Work!";
				break;
			case 4:
				retResponse = "Keep up the good work!";
				break;
	
			}

		}
		else //they got two thirds wrong
		{
			switch (randResponse)
			{
			case 1:
				retResponse = "No. Please try again.";
				break;
			case 2:
				retResponse = "Wrong. Try once more.";
				break;
			case 3:
				retResponse = "Don't give up!";
				break;
			case 4:
				retResponse = "No. Keep trying.";
				break;
			}
		}
		
		System.out.println(retResponse); //print the response
		

		
		
	}// end printQuestionResults
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end class
