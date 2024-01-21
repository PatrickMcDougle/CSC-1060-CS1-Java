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

// Displaying the Time
public class Ch02Program04 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user for input
    // The following statement displays a message in the console window to prompt the user to input
    // a number value.
    System.out.print("Enter an integer for seconds: ");
    int seconds = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    int minutes = seconds / 60; // Find minutes in seconds
    int remainingSeconds = seconds % 60; // Seconds remaining
    System.out.println(
        seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
  } // the end of main.
}
