

/*******************************************************************************
Babak Adeli
SID#: w1206929
AD4
CISP 401
2017 Spring Semester

This is a Java class called ComplexAdd.  It is a child class of
ComplexBase.  This class performs addition on complex numbers.

*******************************************************************************/








//import for DecimalFormat to round to one place
import java.text.DecimalFormat;




public class ComplexAdd extends ComplexBase{

// There are two private double data members (realA and imaginaryA).
// The realA stores the real part of addition of two complex numbers
// and the imaginaryA stores the imaginary part of the addition of two complex numbers.

private double realA;
private double imaginaryA;

// There are three public functions (two ComplexAdd and toString) in this class.

// The first ComplexAdd function does not take any data. (or call no argument constructor)
// It initializes 0s to its super class’s and this class’s private data members.
ComplexAdd(){
  this.real1 = 0.0;
  this.imaginary1 = 0.0;
  this.real2 = 0.0;
  this.imaginary2 = 0.0;
  this.realA = 0.0;
  this.imaginaryA = 0.0;
}

// The second ComplexAdd function takes four double numbers. (or call four-argument constructor)
// It assigns the four numbers to its super calss’s private data members. It also adds  the numbers and gets a result.
// It assigns the real part of the result to the realA and assigns the imaginary part of the result to the imaginaryA.
ComplexAdd(double realArg1, double imaginaryArg1, double realArg2, double imaginaryArg2){
  this.real1 = realArg1;
  this.imaginary1 = imaginaryArg1;
  this.real2 = realArg2;
  this.imaginary2 = imaginaryArg2;

  realA = this.real1 + this.real2; //add the real numbers
  imaginaryA = this.imaginary1 + this.imaginary2; //add the imaginary numbers



}

// The toString function returns one String object but does not take any data.
// It returns a String object which is an equation of Complex numbers addition.
public String toString(){
  //DecimalFormat will round the numbers to one decimal place
  DecimalFormat df = new DecimalFormat("#.#");

  String retString; //declare the string that will get returned to the called

  //place the paranthesis string equation into retString
  retString = "Complex Numbers Addition:      (" + this.real1 + ", " + this.imaginary1 + ") + (" + this.real2 + ", " + this.imaginary2 + ") = (" + df.format(realA) + ", " + df.format(imaginaryA) + ")";

  return retString;


}











}//end class
