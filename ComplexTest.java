/*******************************************************************************
 Babak Adeli
 SID#: w1206929
 A4
 CISP 401
 2017 Spring Semester

 This is a Java application called ComplexTest.  It is the driver for the
 class which performs arithmetic using complex numbers. It initializes two
 complex numbers.  Then it passes and prints the values of these numbers.                                            


 ******************************************************************************/






public class ComplexTest{

  public static void main(String[] args){

    // create two complex numbers with the given values
    Complex a = new Complex(9.5, 7.7);
    Complex b = new Complex(1.2, 3.1);

    //print a proper formatted headline
    System.out.printf("\nA complex number in the form (x, y) is equal to x + yi, where i is square root of -1.\n");

    // Print a second headline
    System.out.printf("\n*-Complex numbers calculations-*\n");

    System.out.printf("a = " + a.toString() + "\n"); // print the value of a

    System.out.printf("b = " + b.toString() + "\n"); //print the value of b

    //print the value of a + b
    System.out.printf("a + b = " + a.add(b).toString() + "\n");

    //print the value of a - b
    System.out.printf("a - b = " + a.subtract(b).toString() + "\n");

    //print the value of a * b
    System.out.printf("a * b = " + a.multiply(b).toString() + "\n");

    //print the value of a / b
    System.out.printf("a / b = " + a.division(b).toString() + "\n");


  }//end main



} // end class
