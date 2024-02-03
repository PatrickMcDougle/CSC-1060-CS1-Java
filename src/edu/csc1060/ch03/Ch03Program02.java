/**
 * Code for Class.
 *
 * <p>Write a program that prompts the user to enter an integer. If the number is a multiple of 5,
 * print "The value entered is a multiple of five!". If the number is divisible by 2, print "The
 * value entered is an even number!".
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// simple program that shows how to us an if statement
public class Ch03Program02 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");

    int number = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    if (number % 5 == 0) {
      System.out.println("The value entered is a multiple of five!");
    }

    if (number % 2 == 0) System.out.println("The value entered is an even number!");
  }
}
