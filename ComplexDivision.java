
/*******************************************************************************
Babak Adeli
SID#: w1206929
AD4
CISP 401
2017 Spring Semester

This is a Java class called ComplexDivision.  It is a child class of
ComplexBase.  This class performs division on complex numbers.

*******************************************************************************/



//import for DecimalFormat to round to one place
import java.text.DecimalFormat;




public class ComplexDivision extends ComplexBase{





  // There are two private double data members (realD and imaginaryD.
  // The realD stores the real part of division of two complex numbers
  // and the imaginaryD stores the imaginary part of the division of two complex numbers.

  private double realD;
  private double imaginaryD;


  // There are three public functions (two Complex Division and toString) in this class.

  // The first Complex Division function does not take any data. (or call no argument constructor)
  // It initializes 0s to its super class’s and this class’s private data members.
  ComplexDivision(){
    this.real1 = 0.0;
    this.imaginary1 = 0.0;
    this.real2 = 0.0;
    this.imaginary2 = 0.0;
    this.realD = 0.0;
    this.imaginaryD = 0.0;
  }

  // The second Complex Division function takes four double numbers. (or call four-argument constructor)
  // It assigns the four numbers to its super class’s private data members.
  ComplexDivision(double realArg1, double imaginaryArg1, double realArg2, double imaginaryArg2){
    this.real1 = realArg1;
    this.imaginary1 = imaginaryArg1;
    this.real2 = realArg2;
    this.imaginary2 = imaginaryArg2;


    // It also divides the numbers and gets a result.
    // It assigns the real part of the result to the realD and assigns the imaginary part of the result to the imaginaryD.
    realD = ( ( (this.real1 * this.real2) + (this.imaginary1 * this.imaginary2) ) / ( (this.real2 * this.real2) + (this.imaginary2 * this.imaginary2) ) );
    imaginaryD = ( ( (this.imaginary1 * this.real2) - (this.real1 * this.imaginary2) ) / ( (this.real2 * this.real2) + (this.imaginary2 * this.imaginary2) ) );
  }

  // The toString function returns one String object but does not take any data.
  // It returns a String object which is an equation of Complex numbers addition.
  public String toString(){
    //DecimalFormat will round the numbers to one decimal place
    DecimalFormat df = new DecimalFormat("#.#");

    String retString; //declare the string that will get returned to the called

    //place the paranthesis string equation into retString
    retString = "Complex Numbers Division:      (" + this.real1 + ", " + this.imaginary1 + ") / (" + this.real2 + ", " + this.imaginary2 + ") = (" + df.format(realD) + ", " + df.format(imaginaryD) + ")";

    return retString;
  }






}//end class
