/***************************************************************************************
 Babak Adeli                                                                     
 SID#: w1206929                                                                  
 AD3                                                                             
 CISP 401                                                                         
 2017 Spring Semester                                                             
                                                                                  
 This is a Java class called Multiply.  It uses a random object to product two positive 
 integers up to 19 and prompts the user to multiply them for an answer.  
 It stores the question and answerin a one dimensional 5 element array that it returns 
 back to the main application.  It also generates a random response based on how the 
 student answered the question.

 ***************************************************************************************/


import java.security.SecureRandom; //import for secure random
import java.util.Scanner; //scanner

public class Multiply {
	
	int[] multArray = new int[5]; //5 element one dim array
	int firstNum; //var for firstnum
	int secondNum; // var for second
	SecureRandom randomNumbers = new SecureRandom(); // random nums will be secure random numbers

	
		
	
	/*
	 * The quiz function is a public function.  
	 * It does not take anything but it return a 5 elements one dimensional integer array.  
	 * It generates interface to ask user to answer an addition problem, and call createQuestion and checkResponse functions. 
	 */
	public int[] quiz()
	{
		createQuestion(); //calls createQuestion

		
		return multArray; //returns the 5 element integer array
	}//end quiz
	
	
	
	
	
	
	
	/*
	 * The createQuestion function is a public function.  
	 * It does not take and return anything.  
	 * It generates a new addition question.
	 */
	public void createQuestion()
	{
		//create the scanner for input
		Scanner input = new Scanner(System.in);
		
		firstNum = randomNumbers.nextInt(20); //generate the first number (0-19)
		secondNum = randomNumbers.nextInt(20); //generate how much to multiply by
		
		//asks the question, then prompts them for a response or -1 to quit
		System.out.println("\nHow much is " + firstNum + " times " + secondNum + "?\nEnter your answer (-1 to exit):"); 
		int userInput = input.nextInt(); //get the input from the user
		
		//fill the array
		multArray[0] = firstNum; //first int
		multArray[1] = 3; //3 is for multiply
		multArray[2] = secondNum; //second int
		multArray[3] = (firstNum - secondNum); //correct answer
		multArray[4] = userInput; //user's answer
		
		
		//call checkResponse passing the user's answer as an argument
		checkResponse(userInput);
		
		
	}// end createQuestion
	

	
	
	
	
	/*
	 * The createResponse function is a public function.  
	 * It takes a boolean data and return a string.  
	 * If it gets a false input it will return “No. Please try again.  A", “Wrong. Try once more. A”, or etc.  
	 * If it gets a true input is will return “Very good! A”, “Excellent! A”, or etc.
	 */
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
				retResponse = "Very good! M";
				break;
			case 2: 
				retResponse = "Excellent! M";
				break;
			case 3: 
				retResponse = "Nice Work! M";
				break;
			case 4:
				retResponse = "Keep up the good work! M";
				break;
	
			}
			
		}
		
		else //if the parameter was false
		{
			switch (randResponse) //response based on random 1-4
			{
			case 1:
				retResponse = "No. Please try again. M";
				break;
			case 2:
				retResponse = "Wrong. Try once more. M";
				break;
			case 3:
				retResponse = "Don't give up! M";
				break;
			case 4:
				retResponse = "No. Keep trying. M";
				break;
			}
		}
		
		
		return retResponse; //return the response to the method that called it

	}//end createResponse
	
	
	
	
	
	
	/*
	 * The checkResponse function is a public function.  
	 * It takes integer input and does not return anything.  
	 * It checks if the user answered correctly, and calls the createResponse function to generate response print out for the class.
	 */
	public void checkResponse(int input)
	{
		String bounceBack = ""; //this will be the response generated from createResponse
		if ((firstNum * secondNum) == input) //if the answer was correct will pass true
		{
			bounceBack = createResponse(true); //it will pass true
			System.out.printf("%s\n\n", bounceBack); //print the response
			
		}
		
		else if (input == -1) //if the user enters -1 to exit
		{
			multArray[0] = -1; //have the first element flagged for exit
			return;
		}
		
		else //only wrong answer left as possibility
		{
			bounceBack = createResponse(false); //if incorrect answer it will pass false
			System.out.printf("%s\n", bounceBack); // print response
			System.out.println("The correct answer is " + (firstNum * secondNum) + ".\n"); //print correct answer
			
		}
	}//end checkResponse

	
	
	
	
	
	
	
	
	
}//end class

