/***************************************************************************************
 Babak Adeli                                                                     
 SID#: w1206929                                                                  
 AD3                                                                             
 CISP 401                                                                         
 2017 Spring Semester                                                             
                                                                                  
 This is a Java class called Addition.  It uses a random object to product two positive 
 integers up to 19 and prompts the user to add them for an answer.  
 It stores the question and answerin a one dimensional 5 element array that it returns 
 back to the main application.  It also generates a random response based on how the 
 student answered the question.

 ***************************************************************************************/


//use secure random to create a secure random number
import java.security.SecureRandom;
import java.util.Scanner; //scanner for input

public class Addition {
	
	int[] addArray = new int[5]; //5 element one dimensional array 
	int firstNum; //first var
	int secondNum; //second var
	SecureRandom randomNumbers = new SecureRandom(); //secure random numbers
	
	
	
	
		
	
	/*
	 * The quiz function is a public function.  
	 * It does not take anything but it return a 5 elements one dimensional integer array.  
	 * It generates interface to ask user to answer an addition problem, and call createQuestion and checkResponse functions. 
	 */
	public int[] quiz()
	{
		createQuestion(); //calls createQuestion

		
		return addArray; //returns the 5 element integer array
	}//end quiz
	
	
	
	
	
	
	
	/*
	 * The createQuestion function is a public function.  
	 * It does not take and return anything.  
	 * It generates a new addition question.
	 */
	public void createQuestion()
	{
		Scanner input = new Scanner(System.in); //create the scanner for input
		
		firstNum = randomNumbers.nextInt(20); //get a random number
		secondNum = randomNumbers.nextInt(20); //second random number between 0 and 19
		
		//ask the question and prompt for input
		System.out.println("\nHow much is " + firstNum + " plus " + secondNum + "?\nEnter your answer (-1 to exit):");
		int userInput = input.nextInt(); //get the user's answer
		
		//fill the array
		addArray[0] = firstNum; //first int
		addArray[1] = 1; //1 is for add
		addArray[2] = secondNum; //second int
		addArray[3] = (firstNum + secondNum); //correct answer
		addArray[4] = userInput; //user's answer
		
		
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
				retResponse = "Very good! A";
				break;
			case 2: 
				retResponse = "Excellent! A";
				break;
			case 3: 
				retResponse = "Nice Work! A";
				break;
			case 4:
				retResponse = "Keep up the good work! A";
				break;
	
			}
			
		}
		
		else //if the parameter was false
		{
			switch (randResponse)
			{
			case 1:
				retResponse = "No. Please try again. A";
				break;
			case 2:
				retResponse = "Wrong. Try once more. A";
				break;
			case 3:
				retResponse = "Don't give up! A";
				break;
			case 4:
				retResponse = "No. Keep trying. A";
				break;
			}
		}
		
		
		return retResponse;
	}//end createResponse
	
	
	
	
	
	
	/*
	 * The checkResponse function is a public function.  
	 * It takes integer input and does not return anything.  
	 * It checks if the user answered correctly, and calls the createResponse function to generate response print out for the class.
	 */
	public void checkResponse(int input)
	{
		String bounceBack = ""; //make a variable to store the response generated from createResponse
		if ((firstNum + secondNum) == input) //if they answered correctly
		{
			bounceBack = createResponse(true); //get good answer
			System.out.printf("%s\n\n", bounceBack); //print answer
			
		}
		
		else if (input == -1) //user decids to quit
		{
			addArray[0] = -1; //flag first element for exit
			return;
		}
		
		else //else they were wrong
		{
			bounceBack = createResponse(false); // get a wrong response
			System.out.printf("%s\n", bounceBack); //print the response
			System.out.println("The correct answer is " + (firstNum + secondNum) + ".\n"); //tell them the correct answer
			
		}
	}//end checkResponse

	
	
	
	
	
	
	
	
	
}//end class












