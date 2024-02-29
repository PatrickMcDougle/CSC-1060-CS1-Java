/**
 * Code for Class.
 *
 * <p>
 * This program demonstrates calling a method max to return the largest of the int values
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

public class Ch06Program01 {

  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    int k = max(i, j); // Invoke max method
    System.out.println("The maximum between " + i + " and " + j + " is " + k);
  }

  /**
   * Return the max between two numbers
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
}
