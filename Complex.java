/*******************************************************************************
Babak Adeli
SID#: w1206929
CISP 401
2017 Spring Semester

This is a Java class called Complex.  It is for performing arithmetic
functions using complex numbers. There are seven public functions
(two Complex, add, subtract, multiply, division, and toString) in this classes.


*******************************************************************************/

import java.text.DecimalFormat;



public class Complex{

  private double real;        //stores the real part of a complex number
  private double complex;     //stores the imaginary part of a complex number


  //this is a no argument constructor that initializes both real and complex numbers to zero
  Complex(){

    real = 0.0;     //real to zero
    complex = 0.0;  //complex to zero
  }


  // The second Complex function takes two double numbers. (or call two-argument constructor)
  // It assigns the two numbers to the private data members.
  Complex(double realArg, double complexArg){

    this.real = realArg;
    this.complex = complexArg;
  }

  //accesor function for real
  public double getReal(){
    return real;
  }

  //accessor function for imaginary
  public double getImaginary(){
    return complex;
  }


  // The add function takes one Complex object and returns one Complex object.
  // The function does two complex numbers addition.
  public Complex add(Complex objectB){

    double sumOfReal;     //store the sum of the real numbers
    double sumOfImaginary; //store the sum of the imaginary numbers

    sumOfReal = objectB.getReal() + this.getReal(); //add the real numbers
    sumOfImaginary = objectB.getImaginary() + this.getImaginary(); //add the imaginary numbers

    //create new Complex number to store the result
    Complex addResult = new Complex(sumOfReal, sumOfImaginary);

    return addResult;
  }


  // The subtract function takes one Complex object and returns one Complex object.
  // The function does two complex numbers subtraction.
  public Complex subtract(Complex objectB){

    double differenceOfReal;  //store difference of real
    double differenceOfImaginary; //store diff of imaginary

    differenceOfReal = this.getReal() - objectB.getReal(); //subtract the real numbers
    differenceOfImaginary = this.getImaginary() - objectB.getImaginary(); //sub the imagine numbesr


    Complex subResult = new Complex(differenceOfReal, differenceOfImaginary);

    return subResult;

  }

  // The multiply function takes one Complex object and returns one Complex object.
  // The function does two complex numbers multiplication.

  public Complex multiply(Complex objectB){

    double productOfReal; //store product of real
    double productOfImaginary; //store product of imaginary

    // if we have (a + bi) * (c + di)), the result should be (ac - bd) + (ad + bc) i.
    productOfReal = ( (this.getReal() * objectB.getReal()) - (this.getImaginary() * objectB.getImaginary()) );
    productOfImaginary = ( (this.getReal() * objectB.getImaginary()) + (this.getImaginary() * objectB.getReal()) );

    //create new Complex number to store the result
    Complex multiplyResult = new Complex(productOfReal, productOfImaginary);

    return multiplyResult;
  }

  // The division function takes one Complex object and returns one Complex object.
  // The function does two complex numbers division.
  public Complex division(Complex objectB){

    double quotientOfReal; //store quotient of real
    double quotientOfImaginary; //store quotient of imaginary

    //if we have (a + bi) / (c + di)), the result should be (ac+bd)+i(bc-ad))/(c2+d2).
    quotientOfReal = ( ( (this.getReal() * objectB.getReal()) + (this.getImaginary() * objectB.getImaginary()) ) / ( (objectB.getReal() * objectB.getReal()) + (objectB.getImaginary() * objectB.getImaginary()) ) );
    quotientOfImaginary = ( ( (this.getImaginary() * objectB.getReal()) - this.getReal() * objectB.getImaginary() ) / ( (objectB.getReal() * objectB.getReal()) + (objectB.getImaginary() * objectB.getImaginary()) ) );

   //create new Complex number to store the result
    Complex divisionResult = new Complex(quotientOfReal, quotientOfImaginary);

    return divisionResult;
  }

  // The toString function returns a String object but does not take any data.
  // The function returns a parenthesis string which represents complex number.
  // The numbers are in floating point format with only one digit after decimal point.
  public String toString(){

    //DecimalFormat will round the numbers to one decimal place
    DecimalFormat df = new DecimalFormat("#.#");


    String compStr; //declare the string that will get returned to call

    // initialize compStr to a paranthesis string which represents complex number
    compStr = "(" + df.format(this.getReal()) + ", " + df.format(this.getImaginary()) + ")";

    return compStr;

  }










}//end class
