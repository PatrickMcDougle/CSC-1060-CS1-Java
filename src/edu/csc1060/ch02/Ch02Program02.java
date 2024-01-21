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

// Computing the Area of a Circle with input from the user through the console.
public class Ch02Program02 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // The following statement declares a variable radius to be a real number.   The memory space
    // is now allocated for radius and has a default value of 0.
    double radius;
    // The following statement declares a variable area to be a real number.   The memory space
    // is now allocated for radius and has a default value of 0.
    double area;

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // The following statement displays a message in the console window to prompt the user to input
    // a number value.
    System.out.print("Enter a number for radius: ");

    // The following statement will assign the value the user types into the console window to the
    // variable radius.
    radius = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    // The following statement will evaluate the expression and assign the results to the variable
    // area.
    area = radius * radius * 3.141592653589793; // area now has the calculate value.

    // The following statement will concatenate the strings and display that string.
    System.out.println("A Circle with radius " + radius + " has an area of " + area);

    // The main method exits.  The program is finished.
  } // the end of main.
}
