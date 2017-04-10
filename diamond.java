/***********************************************************************************
 * Babak Adeli                                                                      *
 * SID#: w1206929                                                                   *
 * AD2                                                                              *
 * CISP 401                                                                         *
 * 2017 Spring Semester                                                             *
 *                                                                                  *
 * This is a Java class called diamond which generates the assigned pattern.        *
 * It prints a diamond consisting of a number of rows determined by the end user.   *
 **********************************************************************************/


public class diamond {
	
	void printDiamond(int oddNum)
	{
		// top half, jump i by 2 to avoid even numbers
		for (int i = 1; i <= oddNum; i=i+2)
		{
			//negative left space in the top half
			for (int j = 1; j <= ((oddNum-i)/2); j++)
			{
				System.out.print(" ");
			}
			
			//print the top half of the diamond
			for (int j = 1; j <=i; j++)
			{
				System.out.print("*");
			}
			
			//negative right space in the top half
			for (int j = 1; j <= ((oddNum-i)/2); j++)
			{
				System.out.print(" ");
			}

			
		System.out.println();	
		}
		
		//bottom half
		for (int i = (oddNum-2); i >= 1; i=i-2)
		{
			//negative left space in the bottom half
			for (int j = 1; j <= ((oddNum-i)/2); j++)
			{
				System.out.print(" ");
			}
			
			//print the bottom half of the diamond
			for (int j = 1; j <=i; j++)
			{
				System.out.print("*");
			}
			
			
			System.out.println();	
		}
	}//end method

}//end class
