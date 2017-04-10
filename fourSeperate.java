/***********************************************************************************
 * Babak Adeli                                                                      *
 * SID#: w1206929                                                                   *
 * AD2                                                                              *
 * CISP 401                                                                         *
 * 2017 Spring Semester                                                             *
 *                                                                                  *
 * This is a Java class called fourSeperate which generates the assigned pattern.   *
 * It prints four triangles separately.                                             *
 **********************************************************************************/


public class fourSeperate {
	
	void printFourSeperate()
	{
		//for loop for the first triangle
		for (int i = 1; i < 11; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
				
		}
		System.out.println();
		
		//for loop for the second triangle
		for (int i = 10; i > 0; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");

			}
			System.out.println();

		}
		System.out.println();
		
		//for loop for the third triangle
		for (int j = 0; j <= 10; j++)
		{
			for (int k = 0; k < j; k++)
			{
				System.out.print(" ");
			}
			for (int l = 0; l < (10-j); l++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		//System.out.println();
		
		//for loop for the fourth triangle
		for (int i = 0; i <= 10; i++)
		{
			for (int j = 0; j < (10-i); j++)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
			
			
	}
	
	

}//end class










