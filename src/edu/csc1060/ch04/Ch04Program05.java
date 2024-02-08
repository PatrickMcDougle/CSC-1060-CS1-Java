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
 * <p>A problem can be solved using many different approaches. This program rewrites the lottery
 * program from Ch03Program09.java using strings. Using strings simplifies this program.
 *
 * <p>With these slight changes that look like things have not changed, this program does function
 * slightly different from the original. Try using a single digit value like 6 as the input in both
 * programs.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch04;

import java.util.Scanner;

// Lottery Game
public class Ch04Program05 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Generate a lottery as a two-digit string
    String lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter your lottery pick (two digits): ");
    String guess = input.nextLine();

    // The following statement will close the input connection to the console window.
    input.close();

    // Get digits from lottery
    int lotteryDigit1 = lottery.charAt(0);
    int lotteryDigit2 = lottery.charAt(1);

    // Get digits from guess
    int guessDigit1 = guess.charAt(0);
    int guessDigit2 = guess.charAt(1);

    System.out.println("The lottery number is " + lottery);

    // Check the guess
    if (guess.equals(lottery)) {
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
