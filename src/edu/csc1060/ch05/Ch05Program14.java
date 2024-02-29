/**
 * Code for Class.
 *
 * <p>
 * Guessing a Number between 0 and 100 until user gets it right.
 *
 * <p>
 * CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

import java.util.Random;
import java.util.Scanner;

public class Ch05Program14 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    Random random = new Random(50);

    // Generate a random number to be guessed
    int number = random.nextInt(101);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Guess a magic number between 0 and 100");

    int guess = -1;

    while (true) {
      // Prompt the user to guess the number
      System.out.print("\nEnter your guess: ");
      guess = input.nextInt();

      if (guess == number) {
        System.out.println("Yes, the number is " + number);
        break;
      }

      // else not needed here. Think about the logic.
      if (guess > number) {
        System.out.println("Your guess (" + guess + ") is too high");
      } else {
        System.out.println("Your guess (" + guess + ") is too low");
      }
    } // END OF INFINITE LOOP

    input.close();
  }
}
