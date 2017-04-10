
/***********************************************************************************
 * Babak Adeli                                                                      *
 * SID#: w1206929                                                                   *
 * AD2                                                                              *
 * CISP 401                                                                         *
 * 2017 Spring Semester                                                             *
 *                                                                                  *
 * This is a Java application called mainMenu that will repeatedly display a choice *
 * menu for end users until a number 4 is entered.                                  *
 **********************************************************************************/



//using JOptionPane to display dialog in a dialog box
import javax.swing.JOptionPane;
//using scanner to get input from user for diamond shape
import java.util.Scanner;


public class mainMenu {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//boolean to keep the menu loop going until user wants to exit
		Boolean exit = false;
		
		
		while (!exit)
		{
			//display main menu dialog box
			String menuOption = JOptionPane.showInputDialog("Draw Triangles and Shapes\nEnter 1 to draw four seperate triangles\nEnter 2 to draw four triangles at the same row\nEnter 3 to draw a diamond\nEnter 4 to exit the program");
			
			int menOpt = Integer.parseInt(menuOption);
			Boolean valid = false;
			
			//first option prints four separate triangles
			if (menOpt == 1)
			{
				fourSeperate fourSeperate1 = new fourSeperate();
				fourSeperate1.printFourSeperate();
			}
			
			//second option prints triangles side by side
			else if (menOpt == 2)
			{
				sideBySide sideBySide1 = new sideBySide();
				sideBySide1.printSideBySide();
			}
			
			//last option prints diamond
			else if (menOpt == 3)
			{
				while (!valid)
				{
					//asks the user how many rows to print
					System.out.printf("Enter number of rows (odd number 1 to 19): \n");
					int rowVal = input.nextInt();
					
					//must make sure the number is odd, and between 1 to 19
					if ( (rowVal % 2 != 0) && (rowVal >= 1) && ( rowVal <= 19) )
					{
						valid = true;
						diamond diamond1 = new diamond();
						diamond1.printDiamond(rowVal);
						diamond1 = null;
					}
					// if incorrect, it will tell the user and have them input another number
					else
					{
						System.out.printf("**The inputted row number %s, is not correct**\n\n", rowVal);
					}
				}
				
			}
			
			//option 4 is to exit the program
			else if (menOpt == 4)
			{
				System.out.println("Thanks to use this program");
				exit = true;
			}
			
			//if they input anything else, tell the user the input was invalid
			else 
			{
				System.out.println("Invalid value entered");
			}
		}
		

	}

}
