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

// Converts Temperatures
public class Ch02Program06 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user for input
    // The following statement displays a message in the console window to prompt the user to input
    // a number value.
    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    // Convert Fahrenheit to Celsius
    double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
    System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
  }
}
