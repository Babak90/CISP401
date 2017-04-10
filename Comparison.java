/***********************************************************************************
 * Babak Adeli                                                                     *
 * SID#: w1206929                                                                  *
 * A1                                                                              *
 * CISP 401                                                                        *
 * 2017 Spring Semester                                                            *
 *                                                                                 *
 * This is a Java application that inputs three integers from a user and displays  *
 * the sum, average, product, smallest, largest, range and median of the numbers.  *
 * It also calculate the largest divide by the smallest number provide the         *
 * quotient and remainder.                                                         *
 **********************************************************************************/



import java.util.Scanner; // program uses class Scanner

public class Comparison 
{
   // main method begins execution of Java application
   public static void main( String args[] )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      int number1; // first number to compare
      int number2; // second number to compare
      int number3; // third number to compare
      
      int temp; //temporary variable for the bubble sort
      
      int range; //store the range here
      int sum;  //store the sum here
      int product; //store the product here
      int average; //store the average here
      int quotientLargeSmall; //store the quotient of the largest div by the smallest here
      int remainderLargeSmall; //store the remainder of the largest div by the smallest here

      System.out.print( "Enter first integer: " ); // prompt 
      number1 = input.nextInt(); // read first number from user 

      System.out.print( "Enter second integer: " ); // prompt 
      number2 = input.nextInt(); // read second number from user
      
      System.out.print( "Enter third integer: " ); // prompt
      number3 = input.nextInt(); // read third number from user
      
      //System.out.print("\nFor the numbers ");
      System.out.printf("\nFor the numbers %d, %d and %d", number1, number2, number3);
      
      //this is a while loop to bubble sort the integers in ascending order
      //we want ascending order, so this will loop while numbers are out of order
      while ((number1 > number2) || (number2 > number3) || (number1 > number3))
      {
    	  //we want ascending order, so if swap 1 and 2 if they are out of order
	      if (number1 > number2)
	      {
	    	  temp = number1;
	    	  number1 = number2;
	    	  number2 = temp;
	      }
	      
	      //do the same for 2 and 3
	      if (number2 > number3)
	      {
	    	  temp = number2;
	    	  number2 = number3;
	    	  number3 = temp;
	      }
	      
	      //finally 1 and 3
	      if (number1 > number3)
	      {
	    	  temp = number1;
	    	  number1 = number3;
	    	  number3 = temp;
	      }
      }
      
      //we move on to calculating the integers we will later print
      
      range = number3 - number1; //calculate the range
      
      sum = number1 + number2 + number3; //calculate the sum
      
      product = number1 * number2 * number3; //calculate the product
      
      average = sum/3; //calcuate the average
      
      quotientLargeSmall = number3/number1; //calculate the quotient of the largest and smallest
      
      remainderLargeSmall = number3%number1; //finally the remainder
      
      
      //finally we will print the numbers the assignment was looking for
      
      System.out.printf("\nThe largest is %d.", number3);  //print the largest number
      
      System.out.printf("\nThe smallest is %d.", number1); //print the smallest number
      
      System.out.printf("\nThe median is %d.", number2);   //print the median number
      
      System.out.printf("\nThe range is %d.", range);      //print the range
      
      System.out.printf("\nThe sum is %d.", sum);          //print the sum
      
      System.out.printf("\nThe product is %d.", product);  //print the product
      
      System.out.printf("\nThe average is %d.", average);  //print the average
      
      System.out.printf("\n\nQuotient of the largest divided by the smallest is %d.", quotientLargeSmall); //print the quotient
      
      System.out.printf("\n\nRemainder of the largest divided by the smallest is %d.", remainderLargeSmall); //print the remainder
      

   } // end method main

} // end class Comparison

