/**
 * Code for Class.
 *
 * <p>Often the number of times a loop is executed is not predetermined. You may use an input value
 * to signify the end of the loop. Such a value is known as a sentinel value. Write a program that
 * reads and calculates the sum of an unspecified number of integers. The input 0 signifies the end
 * of the input.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

import java.util.Scanner;

public class Ch05Program06 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    int data = 0;
    int sum = 0;

    do {
      // Read the next data
      System.out.print("Enter an integer (the input ends if it is 0): ");
      data = input.nextInt();
      sum += data;
    } while (data != 0);
    // Keep reading data until the input is 0

    input.close();

    System.out.println("The sum is " + sum);
  }
}
