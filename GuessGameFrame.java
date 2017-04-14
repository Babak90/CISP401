/*
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.Color;
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class GuessGameFrame extends JFrame {

  Random rand = new Random(); //for Random
  private int correctNumber = rand.nextInt(1000); //NEED TO MOVE THIS LATER
  private int guessInteger; // the user's guess in integer form
  //private int correctNumber; //the number to guess
  private int guessCounter; //keep tracks of guess attempts
  //private int lastDistance; // distance between last guess and number
  private JTextField guessInputJTextField; // for guessing
  private JLabel prompt1JLabel; // first prompt to user
  private JLabel prompt2JLabel; // second prompt to user
  //private JLabel messageJLabel; // displays message of game status
  private JButton newGameJButton; // creates new game
  //private Color background; // background color of application


  int[] guessedNumbersArray = new int[100]; //int array to store guesses

  //Random rand = new Random(); //for Random











  //public GuessGameFrame function sets up GUI, initializes values and adds action listener
  public GuessGameFrame(){
    super("Babak's Guessing Game"); //this is the title
    theGame();



  }//end GuessGameFrame

  //public  theGame function provides a new random number.
  public void theGame(){

    //super("Babak's Guessing Game"); //this is the title
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1000, 100);
    this.setVisible(true);

    this.setLayout(new FlowLayout()); //create the layout



    paint();


    prompt1JLabel = new JLabel(firstPromptGenerator()); //first prompt to user
    add(prompt1JLabel);


    guessInputJTextField = new JTextField(5); //for the user's guess
    add(guessInputJTextField);


    prompt2JLabel = new JLabel(secondPromptGenerator()); //second prompt to user
    add(prompt2JLabel);

    newGameJButton = new JButton("Start Game");
    add(newGameJButton);

    //HANDLERS
    GuessHandler handler = new GuessHandler(); //action handler
    guessInputJTextField.addActionListener(handler);
    newGameJButton.addActionListener(handler);



  }

  //public  paint function changes JFrame background color.
  public void paint(){
    Container a = this.getContentPane();
    if (guessCounter == 0){
      a.setBackground(Color.magenta);
    }

    else if (guessInteger == correctNumber){
      a.setBackground(Color.green);
    }

    else if ((Math.abs( correctNumber - guessInteger )) > (Math.abs( correctNumber -  guessedNumbersArray[guessCounter-1]))){
      a.setBackground(Color.red);
    }

    else{
      a.setBackground(Color.orange);
    }


  }






  //This is a function to generate the first prompt to the user
  public String firstPromptGenerator(){
    String returnFirstPrompt;
    if (guessCounter == 0){ //if it is their first guess, it will always show this prompt
      returnFirstPrompt = "I have a number between 1 and 1000. Can you guess my number? Enter your first Guess: ";
    }

    else if (guessInteger == correctNumber) {
      returnFirstPrompt = "After " + guessCounter + "trials, you guessed the number " + correctNumber + " correct. You are great! Try again? Click the New Game button.";

    }

    else{
      returnFirstPrompt = "Guessed Number(s): "; //show the previous guesses
      for (int i = 1; i <= this.guessCounter; i++){
        returnFirstPrompt = returnFirstPrompt + guessedNumbersArray[i] + ", ";
      }

      returnFirstPrompt = returnFirstPrompt + "Can you guess my number? Enter guess #" + (this.guessCounter + 1) + ": ";
    }
    return returnFirstPrompt;
  }









  public String secondPromptGenerator(){

    String returnSecondPrompt = "";

    if (guessCounter == 0){ //if its their first guess
      returnSecondPrompt = "Guess results appear here.";
    }

    else if(guessInteger > correctNumber) { //they guessed too high
      returnSecondPrompt = "Too high. Try a lower number";

    }

    else if(guessInteger < correctNumber){ //they guessed too low
      returnSecondPrompt = "Too low. Try a higher number";
    }

    else if (guessInteger == correctNumber){
      returnSecondPrompt = "Correct!";
    }

    return returnSecondPrompt;

  }









  //public react function reacts to a new guess number entered.
  public void react(){

    guessCounter++; //increment the guess counter

    //JOptionPane.showMessageDialog(null, "we out here fam" + guessCounter);

    guessedNumbersArray[guessCounter] = guessInteger; //place the guesses in the array

    getContentPane().removeAll(); //this resets the board for the next guess
    theGame(); //play another guess



  }

  public void startOver(){
    guessCounter = 0;
    correctNumber = rand.nextInt(1000);
    guessedNumbersArray = new int[100];
    getContentPane().removeAll();
    theGame();

  }










  //GuessHandler class implements ActionListener.
  //It declares the ActionListener interfaces that are to be implemented by the class.
  //It is an inner class to act on user inputs.

  private class GuessHandler implements ActionListener{

    public void actionPerformed(ActionEvent event){


      if(event.getSource() == guessInputJTextField){ //action handler if they click in the guess box

        try{ //try block to make sure the user guesses an integer
          String guessInputConvert = String.format(event.getActionCommand());

          guessInteger = Integer.parseInt(guessInputConvert); //parse the text into an int

          react(); //if A-OK! lets go to react
        }


        catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error! Please guess an integer");
        }


      }

      else if(event.getSource()==newGameJButton){
        startOver();
      }


    }//end actionPerformed


  }//end class GuessHandler





}//end GuessGameFrame class
