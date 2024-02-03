/**
 * Code for Class.
 *
 * <p>Here is a program that checks whether a number is divisible by 2 and 3, whether a number is
 * divisible by 2 or 3, and whether a number is divisible by 2 or 3 but not both
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Test Boolean Operators
public class Ch03Program06 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    if (number % 2 == 0 && number % 3 == 0) {
      System.out.println(number + " is divisible by 2 and 3.");
    }

    if (number % 2 == 0 || number % 3 == 0) {
      System.out.println(number + " is divisible by 2 or 3.");
    }

    if (number % 2 == 0 ^ number % 3 == 0) {
      System.out.println(number + " divisible by 2 or 3, but not both.");
    }
  }
}
