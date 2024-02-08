/**
 * Code for Class.
 *
 * <p>Write a program that converts a hexadecimal digit into a decimal value.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch04;

import java.util.Scanner;

public class Ch04Program04 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a hex digit
    System.out.print("Enter a hex digit: ");
    String hexString = input.nextLine();

    // The following statement will close the input connection to the console window.
    input.close();

    // Check if the hex string has exactly one character
    if (hexString.length() != 1) {
      System.out.println("You must enter exactly one (1) character!");
      System.exit(1);
    }

    // Display decimal value for the hex digit
    char ch = Character.toUpperCase(hexString.charAt(0));
    if ('A' <= ch && ch <= 'F') {
      int value = ch - 'A' + 10;
      System.out.println("The decimal value for the hex digit " + ch + " is " + value);
    } else if (Character.isDigit(ch)) {
      System.out.println("The decimal value for the hex digit " + ch + " is " + ch);
    } else {
      System.out.println(ch + " is an invalid input!");
    }
  }
}
