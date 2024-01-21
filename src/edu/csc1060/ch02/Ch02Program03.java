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

import java.util.Scanner; // Scanner is in the java.util package

// Compute the average value of three numbers.
public class Ch02Program03 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // The following statement displays a message in the console window to prompt the user to input
    // three number values.
    System.out.print("Enter three numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    // Compute average
    double average = (number1 + number2 + number3) / 3;

    // Display result
    // The following statement will concatenate the strings and display that string.
    System.out.println(
        "The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
  }
}
