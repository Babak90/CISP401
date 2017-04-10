/***********************************************************************************
 * Babak Adeli                                                                      *
 * SID#: w1206929                                                                   *
 * A2                                                                               *
 * CISP 401                                                                         *
 * 2017 Spring Semester                                                             *
 *                                                                                  *
 * This is a Java class called employee that includes three instance variables.     *
 * The three variables are a first name of type string, a last name of type string, *
 * and a monthly salary of type double.  This class also provides a constructor     *
 * that initializes the three variables and provides get and set methods for each   *
 * instance variable.  If the monthly salary is not positive, it will display the   *
 * inputted salary and set the salary to $1,000 value.                              *
 **********************************************************************************/


public class Employee {
	
	private String firstName;
	private String lastName;
	private Double monthlySalary;
	
	//Constructor
	Employee(String fNameParam, String lNameParam, Double mSalParam)
	{
		firstName = fNameParam;
		lastName = lNameParam;
		//if the monthly salary value is not positive, display the inputed value and set the salary to $1,000 value
		if (mSalParam < 0.00)
		{
			System.out.printf("The inputted value: %.2f for %s %s is less than zero.\nIt has been changed to $1,000.\n", mSalParam, firstName, lastName);
			mSalParam = 1000.00;
		}
		monthlySalary = mSalParam;
	}// end constructor
	
	//set method for first name
	void setFirstName(String fNameParam)
	{
		firstName = fNameParam;
	}
	
	//get method for first name
	String getFirstName()
	{
		return firstName;
	}
	
	//set method for last name
	void setLastName(String lNameParam)
	{
		lastName = lNameParam;
	}
	
	//get method for last name
	String getLastName()
	{
		return lastName;
	}
	
	//set method for monthly salary
	void setMonthlySalary(Double mSalParam)
	{
		//if the monthly salary value is not positive, display the inputed value and set the salary to $1,000 value
		if (mSalParam < 0.00)
		{
			System.out.printf("The inputted value: %.2f for %s %s is less than zero.\nIt has been changed to $1,000.\n", mSalParam, firstName, lastName);
			mSalParam = 1000.00;
		}
		monthlySalary = mSalParam;
	}
	
	//get method for monthly salary
	Double getMonthlySalary()
	{
		return monthlySalary;
	}

} //end employee class



















