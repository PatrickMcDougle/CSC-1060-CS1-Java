/**
 * Code for Class.
 *
 * <p>Write a program that randomly generates a lottery of a two-digit number, prompts the user to
 * enter a two-digit number, and determines whether the user wins according to the following rule:
 *
 * <ul>
 *   <li>If the user input matches the lottery in exact order, the award is $10,000.
 *   <li>If the user input matches the lottery, the award is $3,000.
 *   <li>If one digit in the user input matches a digit in the lottery, the award is $1,000.
 * </ul>
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Lottery Game
public class Ch03Program09 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Generate a lottery
    int lottery = (int) (Math.random() * 100);

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter your lottery pick (two digits): ");
    int guess = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    // Get digits from lottery
    int lotteryDigit1 = lottery / 10;
    int lotteryDigit2 = lottery % 10;

    // Get digits from guess
    int guessDigit1 = guess / 10;
    int guessDigit2 = guess % 10;

    System.out.println("The lottery number is " + lottery);

    // Check the guess
    if (guess == lottery) {
      System.out.println("Exact match: you win $10,000");
    } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
      System.out.println("Match all digits: you win $3,000");
    } else if (guessDigit1 == lotteryDigit1
        || guessDigit1 == lotteryDigit2
        || guessDigit2 == lotteryDigit1
        || guessDigit2 == lotteryDigit2) {
      System.out.println("Match one digit: you win $1,000");
    } else {
      System.out.println("Sorry, no match");
    }
  }
}
