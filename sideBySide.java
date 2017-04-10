/***********************************************************************************
 * Babak Adeli                                                                      *
 * SID#: w1206929                                                                   *
 * AD2                                                                              *
 * CISP 401                                                                         *
 * 2017 Spring Semester                                                             *
 *                                                                                  *
 * This is a Java class called sideBySide which generates the assigned pattern.     *
 * It prints four triangles side by side from one another.                          *
 **********************************************************************************/


public class sideBySide {
	
	void printSideBySide()
	{
		//outer loop
		for (int i = 1; i < 11; i++)
		{
			//for loop for the first triangle
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
			//for loop for the negative space in the first triangle
			for (int j = 1; j < (11-i); j++)
			{
				System.out.print(" ");
			}
			
			//space between the triangles
			for (int j = 1; j < 6; j++)
			{
				System.out.print(" ");
			}
			
			//for loop for the second triangle
			for (int j = 1; j <= (11-i); j++)
			{
				System.out.print("*");
			}
			
			//for loop for the negative space in the second triangle
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			
			//space between the triangles
			for (int j = 1; j < 5; j++)
			{
				System.out.print(" ");
			}
			
			
			//for loop for the negative space in the third triangle
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			
			//for loop for the third triangle
			for (int j = 1; j <= (11-i); j++)
			{
				System.out.print("*");
			}
			
			//space between the triangles
			for (int j = 1; j < 6; j++)
			{
				System.out.print(" ");
			}
			
			//for loop for the negative space in the second triangle
			for (int j = 1; j <= (11-i); j++)
			{
				System.out.print(" ");
			}
			
			//for loop for the second triangle
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
			//space between the triangles
			for (int j = 1; j < 5; j++)
			{
				System.out.print(" ");
			}

			//position the next line
			System.out.println();
			
			
		}//end outer loop
	}

}//end class
