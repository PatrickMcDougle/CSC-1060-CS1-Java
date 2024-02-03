/**
 * Code for Class.
 *
 * <p>This program first prompts the user to enter a year as an int value and checks if it is a leap
 * year. A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Determining Leap Year
public class Ch03Program08 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    // Check if the year is a leap year
    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box
    System.out.println(year + " is a leap year? " + isLeapYear);
  }
}
