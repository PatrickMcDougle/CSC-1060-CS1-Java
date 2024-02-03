/**
 * Code for Class.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Test Bitwise Operators
public class Ch03Program07 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    System.out.println(number1 + " & " + number2 + " = " + (number1 & number2));
    System.out.println(number1 + " | " + number2 + " = " + (number1 | number2));

    System.out.println();
    System.out.println("  " + Integer.toString(number1, 2));
    System.out.println("& " + Integer.toString(number2, 2));
    System.out.println("------");
    System.out.println("  " + Integer.toString((number1 & number2), 2));
    System.out.println();
    System.out.println("  " + Integer.toString(number1, 2));
    System.out.println("| " + Integer.toString(number2, 2));
    System.out.println("------");
    System.out.println("  " + Integer.toString((number1 | number2), 2));
    System.out.println();
  }
}
