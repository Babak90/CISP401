/*******************************************************************************
Babak Adeli
SID#: w1206929
AD4
CISP 401
2017 Spring Semester

This is a Java class called ComplexBase.  The superclass for the four different
subclasses that perform arithmetic on complex numbers.  No objects of this
class are created.

*******************************************************************************/





public class ComplexBase{

    //There are four private double data members (real1, imaginary1, real2 and imaginary2).
    //The real stores the real part of a complex number and
    //the imaginary stores the imaginary part of a complex number.
    protected double real1;
    protected double imaginary1;
    protected double real2;
    protected double imaginary2;

    // There are six public functions (two ComplexBase, getFirstReal, getFirstImaginary,
    // getSecondReal, and getSecondImaginary) in this class.

  // The first ComplexBase function does not take any data. (or call no argument constructor)
  // It initializes 0s to the private data members.
  ComplexBase(){
    this.real1 = 0.0;
    this.imaginary1 = 0.0;
    this.real2 = 0.0;
    this.imaginary2 = 0.0;
  }

  // The second ComplexBase function takes four double numbers. (or call four-argument constructor)
  // It assigns the four numbers to the private data members.
  ComplexBase(double realArg1, double imaginaryArg1, double realArg2, double imaginaryArg2){
    this.real1 = realArg1;
    this.imaginary1 = imaginaryArg1;
    this.real2 = realArg2;
    this.imaginary2 = imaginaryArg2;
  }

  // The getFirstReal function returns one double number but does not take any data.
  // It returns the real1.
  public double getFirstReal(){
    return this.real1;
  }

  // The getFirstImaginary function returns one double number but does not take any data.
  // It returns the imaginary1.
  public double getFirstImaginary(){
    return this.imaginary1;
  }

  // The getSecondReal function returns one double number but does not take any data.
  // It returns the real2.
  public double getSecondReal(){
    return this.real2;
  }

  // The getSecondImaginary function returns one double number but does not take any data.
  // It returns the imaginary2
  public double getSecondImaginary(){
    return this.imaginary2;
  }


} //end class
