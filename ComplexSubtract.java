
/*******************************************************************************
Babak Adeli
SID#: w1206929
AD4
CISP 401
2017 Spring Semester

This is a Java class called ComplexSubtract.  It is a child class of
ComplexBase.  This class performs subtraction on complex numbers.

*******************************************************************************/


//import for DecimalFormat to round to one place
import java.text.DecimalFormat;




public class ComplexSubtract extends ComplexBase{

// There are two private double data members (realS and imaginaryS).
// The realS stores the real part of subtraction of two complex numbers
// and the imaginaryS stores the imaginary part of the subtraction of two complex numbers.
  private double realS;
  private double imaginaryS;

//There are three public functions (two ComplexSubtract and toString) in this class.

 // The first ComplexSubtract function does not take any data. (or call no argument constructor)
 // It initializes 0s to its super class’s and this class’s private data members.
 ComplexSubtract(){
   this.real1 = 0.0;
   this.imaginary1 = 0.0;
   this.real2 = 0.0;
   this.imaginary2 = 0.0;
   this.realS = 0.0;
   this.imaginaryS = 0.0;

 }

// The second ComplexSubtract function takes four double numbers.
// (or call four-argument constructor)
// It assigns the four numbers to its super class’s private data members.
// It also does subtraction on the numbers and get a result.
ComplexSubtract(double realArg1, double imaginaryArg1, double realArg2, double imaginaryArg2){
  this.real1 = realArg1;
  this.imaginary1 = imaginaryArg1;
  this.real1 = realArg2;
  this.imaginary2 = imaginaryArg2;


  // It assigns the real part of the result to the realS
  // and assigns the imaginary part of the result to the imaginaryS.
  realS =  this.real1 - this.real2;
  imaginaryS = this.imaginary1 - this.imaginary2;

}

// The toString function returns one String object but does not take any data.
// It returns a String object which is an equation of Complex numbers addition.
public String toString(){
  //DecimalFormat will round the numbers to one decimal place
  DecimalFormat df = new DecimalFormat("#.#");

  String retString; //declare the string that will get returned to the called

  //place the paranthesis string equation into retString
  retString = "Complex Numbers Subtraction:      (" + this.real1 + ", " + this.imaginary1 + ") - (" + this.real2 + ", " + this.imaginary2 + ") = (" + df.format(realS) + ", " + df.format(imaginaryS) + ")";

  return retString;


}











}//end class
