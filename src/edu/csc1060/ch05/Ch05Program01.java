/**
 * Code for Class.
 *
 * <p>
 * This program prompts the user to enter an answer for a question on addition of two single digits.
 * Using a loop, you can now rewrite the program to let the user enter a new answer until it is
 * correct.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

import java.util.Random;
import java.util.Scanner;

public class Ch05Program01 {

  public static void main(String[] args) {
    Random random = new Random();

    int number1 = random.nextInt(10);
    int number2 = random.nextInt(10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print("What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();

    while (number1 + number2 != answer) {
      System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
      answer = input.nextInt();
    }

    input.close();

    System.out.println("You got it!");
  }
}
