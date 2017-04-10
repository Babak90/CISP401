/***********************************************************************************
 * Babak Adeli                                                                      *
 * SID#: w1206929                                                                   *
 * A2                                                                               *
 * CISP 401                                                                         *
 * 2017 Spring Semester                                                             *
 *                                                                                  *
 *  This is a Java application called EmployeeTest that demostrates the Class		*
 *  Employee's capabilities.  It creates three objects and displays the three 		*
 *  object's salaries.  It then gives each employee a 10% raise and display's each	*
 *  employee's yearly salary again.													*
 **********************************************************************************/


public class EmployeeTest {

	public static void main(String[] args) {
		
		//create the three employee objects with the correct information
		Employee employee1 = new Employee("Bob", "Jones", 2875.00);
		Employee employee2 = new Employee("Susan", "Baker", 3150.75);
		Employee employee3 = new Employee("John", "Lin", -5000.00);
		
		//call printEmployees
		printEmployees(employee1, employee2, employee3);
		
		//call giveRaise
		giveRaise(employee1, employee2, employee3);
		
		//call printEmployees again
		printEmployees(employee1, employee2, employee3);
	}
	
	//method to print employee names and salaries
	static void printEmployees(Employee employee1, Employee employee2, Employee employee3)
	{
		System.out.printf("\nEmployee 1: %s %s; Yearly Salary: %.2f", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary());
		System.out.printf("\nEmployee 2: %s %s; Yearly Salary: %.2f", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary());
		System.out.printf("\nEmployee 3: %s %s; Yearly Salary: %.2f\n", employee3.getFirstName(), employee3.getLastName(), employee3.getMonthlySalary());

	}
	
	//method to give the employees a 10% raise
	static void giveRaise(Employee employee1, Employee employee2, Employee employee3)
	{
		System.out.println("\nIncreasing employee salaries by 10%");
		employee1.setMonthlySalary(employee1.getMonthlySalary()+(employee1.getMonthlySalary()*0.1));
		employee2.setMonthlySalary(employee2.getMonthlySalary()+(employee2.getMonthlySalary()*0.1));
		employee3.setMonthlySalary(employee3.getMonthlySalary()+(employee3.getMonthlySalary()*0.1));
	}

}//end class
