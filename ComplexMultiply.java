
/*******************************************************************************
Babak Adeli
SID#: w1206929
AD4
CISP 401
2017 Spring Semester

This is a Java class called ComplexMultiply.  It is a child class of
ComplexBase.  This class performs multiplication on complex numbers.

*******************************************************************************/










//import for DecimalFormat to round to one place
import java.text.DecimalFormat;




public class ComplexMultiply extends ComplexBase{


// There are two private double data members (realM and imaginaryM).
// The realM stores the real part of multiplication of two complex numbers and
// the imaginaryM stores the imaginary part of the multiplication of two complex numbers.
  private double realM;
  private double imaginaryM;

 //There are three public functions (two ComplexMultiply and toString) in this class.

 // The first ComplexMultiply function does not take any data. (or call no argument constructor)
 // It initializes 0s to its super class’s and this class’s private data members.
 ComplexMultiply(){
   this.real1 = 0.0;
   this.imaginary1 = 0.0;
   this.real2 = 0.0;
   this.imaginary2 = 0.0;
   this.realM = 0.0;
   this.imaginaryM = 0.0;
 }

 // The second ComplexMultiply function takes four double numbers. (or call four-argument constructor)
 // It assigns the four numbers to its super class’s private data members.
 ComplexMultiply(double realArg1, double imaginaryArg1, double realArg2, double imaginaryArg2){
   this.real1 = realArg1;
   this.imaginary1 = imaginaryArg1;
   this.real2 = realArg2;
   this.imaginary2 = imaginaryArg2;

   // It also multiplies the numbers and gets a result.
   // It assigns the real part of the result to the realM and
   // assigns the imaginary part of the result to the imaginaryM.
   realM = ( (this.real1 * this.real2) - (this.imaginary1 * this.imaginary2) );
   imaginaryM = ( (this.real1 * this.real2) + (this.imaginary1 * this.imaginary2) );


}


  // The toString function returns one String object but does not take any data.
  // It returns a String object which is an equation of Complex numbers multiplication.
  public String toString(){
    //DecimalFormat will round the numbers to one decimal place
    DecimalFormat df = new DecimalFormat("#.#");

    String retString; //declare the string that will get returned to the called

    //place the paranthesis string equation into retString
    retString = "Complex Numbers Multiiplication:      (" + this.real1 + ", " + this.imaginary1 + ") * (" + this.real2 + ", " + this.imaginary2 + ") = (" + df.format(realM) + ", " + df.format(imaginaryM) + ")";

    return retString;
  }



} //end class
