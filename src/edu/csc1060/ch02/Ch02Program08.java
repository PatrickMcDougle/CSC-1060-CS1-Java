/**
 * Code for Class. This program prints Welcome to Java!
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch02;

import java.util.Scanner;

// One way to only show 2 or less decimal places with floating-point numbers.
public class Ch02Program08 {
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user for input
    // The following statement displays a message in the console window to prompt the user to input
    // a number value.
    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    double tax = purchaseAmount * 0.06;
    System.out.println("Sales tax is " + (int) (tax * 100.0) / 100.0);
  }
}
