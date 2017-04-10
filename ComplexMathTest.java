/*******************************************************************************
 Babak Adeli
 SID#: w1206929
 A4
 CISP 401
 2017 Spring Semester

 This is a Java application called ComplexMathTest.  It is the driver for the
 classes which performs arithmetic using complex numbers. It has a 14 element
 array of coplex numbers which it prints using a for loop.


 ******************************************************************************/








public class ComplexMathTest{


  public static void main(String[] args){

    // Create 14 elements ComplexBase objects array. It name is complex.
    ComplexBase[] complex = new ComplexBase[14]; //5 element one dimensional array

    // Create a ComplexAdd object with (9.5, 7.7, 1.2, 3.1) as arguments
    // and assign to the first element of the complex array.
    complex[0] = new ComplexAdd(9.5, 7.7, 1.2, 3.1);

    // Create a ComplexSubtract object with (9.5, 7.7, 1.2, 3.1) as arguments and
    // assign to the second element of the complex array.
    complex[1] = new ComplexSubtract(9.5, 7.7, 1.2, 3.1);

    // Create a ComplexMultiply object with (9.5, 7.7, 1.2, 3.1) as arguments and
    // assign to the third element of the complex array.
    complex[2] = new ComplexMultiply(9.5, 7.7, 1.2, 3.1);

    // Create a ComplexDivision object with (9.5, 7.7, 1.2, 3.1) as arguments
    // and assign to the fourth element of the complex array.
    complex[3] = new ComplexDivision(9.5, 7.7, 1.2, 3.1);

    // Create a ComplexAdd object with (-6.3, 5.2, 3.4, -2.8) as arguments and
    // assign to the fifth element of the complex array.
    complex[4] = new ComplexAdd(-6.3, 5.2, 3.4, -2.8);

    // Create a ComplexSubtract object with (-6.3, 5.2, 3.4, -2.8) as arguments
    // and assign to the sixth element of the complex array.
    complex[5] = new ComplexSubtract(-6.3, 5.2, 3.4, -2.8);

    // Create a ComplexMultiply object with (-6.3, 5.2, 3.4, -2.8) as arguments
    // and assign to the seventh element of the complex array.
    complex[6] = new ComplexMultiply(-6.3, 5.2, 3.4, -2.8);

    // Create a ComplexDivision object with (-6.3, 5.2, 3.4, -2.8) as arguments
    // and assign to the eighth element of the complex array.
    complex[7] = new ComplexDivision(-6.3, 5.2, 3.4, -2.8);

    // Create a ComplexDivision object with (-6.3, 5.2, 0.0, 0.0) as arguments
    // and assign to the ninth element of the complex array.
    complex[8] = new ComplexDivision(-6.3, 5.2, 0.0, 0.0);

    // Create a ComplexAdd object without any argument and assign to the tenth element of the complex array.
    complex[9] = new ComplexAdd();

    // Create a ComplexSubtract object without any argument and assign to the eleventh element of the complex array.
    complex[10] = new ComplexSubtract();

    // Create a ComplexMultiply object without any argument and assign to the twelfth element of the complex array.
    complex[11] = new ComplexMultiply();

    // Create a ComplexDivision object without any argument and assign to the thirteenth element of the complex array.
    complex[12] = new ComplexDivision();

    // Create a ComplexDivision object with (0, 0, 0, 0.1) as arguments and
    // assign to the fourteenth element of the complex array.
    complex[13] = new ComplexDivision(0, 0, 0, 0.1);

    // Print a proper formatted headline
    // “A complex number in the form (x, y) is equal to x + yi, where i is square root of -1.”
    System.out.println("A complex number in the form (x, y) is equal to x + yi, where i is square root of -1.");

    // Print a second headline "* ~~~~~~~********--------Complex numbers calculations--------********~~~~~~~”
    System.out.println("* ~~~~~~~********--------Complex numbers calculations--------********~~~~~~~");

    // Print all of the equations and results
    for (ComplexBase currentComplex : complex)
              System.out.println( currentComplex);



  }//end main




}//end class
