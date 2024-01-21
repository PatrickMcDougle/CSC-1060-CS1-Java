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

// Calculations involving floating-point numbers are approximated because these numbers are not
// stored with complete accuracy.
public class Ch02Program05 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // displays: 0.5000000000000001  NOT 0.5
    System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

    // displays: 0.09999999999999998  NOT 0.1
    System.out.println(1.0 - 0.9);

    System.out.println(Math.pow(2, 3)); // Displays 8.0
    System.out.println(Math.pow(4, 0.5)); // Displays 2.0
    System.out.println(Math.pow(2.5, 2)); // Displays 6.25
    System.out.println(Math.pow(2.5, -2)); // Displays 0.16

    System.out.println(5 / 2.0); // What is wrong?
  }
}
