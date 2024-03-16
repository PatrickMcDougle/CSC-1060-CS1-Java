/**
 * Code for Class.
 *
 * <p>
 * This program demonstrates overloading methods
 *
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch06;

public class Ch06Program08 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("***********************");
    System.out.println("* Overloading Methods *");
    System.out.println("***********************");
    System.out.println();

    // Invoke the max method with int parameters
    System.out.println("The maximum of 3 and 4 is " + max(3, 4));

    // Invoke the max method with the double parameters
    System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));

    // Invoke the max method with three double parameters
    System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
  }

  /**
   * Return the max between two integer numbers
   *
   * @param num1 first of the two numbers to test if its larger then the other
   * @param num2 second of the two numbers to test if its larger then the other
   * @return the larger value of the two that was given.
   */
  public static int max(int num1, int num2) {
    int result;

    if (num1 > num2) {
      result = num1;
    } else {
      result = num2;
    }

    return result; // Return result
  }

  /**
   * Return the max between two double numbers
   *
   * @param num1 first of the two numbers to test if its larger then the other
   * @param num2 second of the two numbers to test if its larger then the other
   * @return the larger value of the two that was given.
   */
  public static double max(double num1, double num2) {

    if (num1 > num2) {
      return num1;
    }

    return num2;
  }

  /**
   * Return the max between three double numbers
   *
   * @param num1 first of the three numbers to test if its larger then the other
   * @param num2 second of the three numbers to test if its larger then the other
   * @param num3 third of the three numbers to test if its larger then the other
   * @return the larger value of the three that was given.
   */
  public static double max(double num1, double num2, double num3) {
    return max(max(num1, num2), num3);
  }
}
