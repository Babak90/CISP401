/*******************************************************************************************
 Babak Adeli                                                                     
 SID#: w1206929                                                                  
 AD3                                                                             
 CISP 401                                                                         
 2017 Spring Semester                                                             
                                                                                  
 This is a Java application called Multiply3Test that will help an elementary school student
 learn multiplication.  It produces an object of the Multiply3 class then calls its quiz
 method.  Then it calls its printQuestionResults function to show the results of the test.

 ******************************************************************************************/

public class Multiply3Test {

	public static void main(String[] args) {
		
		//create a Multiply3 object
		Multiply3 Multiply3_1 = new Multiply3();
		
		//calls the quiz method
		Multiply3_1.quiz();	
		
		//calls the printQuestionResult method
		Multiply3_1.printQuestionResult();
		

	}

}

