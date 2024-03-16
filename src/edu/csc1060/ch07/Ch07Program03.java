/**
 * Code for Class.
 *
 * <p>
 * Pass-by value example
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program03 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    // x represents an int value
    int x = 1;
    // y represents an array of int values
    int[] y = new int[10];

    // Invoke m with arguments x and y
    m(x, y);

    System.out.println("x is " + x);
    System.out.println("y[0] is " + y[0]);
  }

  /**
   * This method assigns values to the parameters that are passed in.
   */
  public static void m(int number, int[] numbers) {
    // Assign a new value to number, but not the value that was used to call this method.
    number = 1001;

    // Assign a new value to numbers[0] and the array is forever changed.
    numbers[0] = 5555;

    // numbers array is only replaced here in the method. Original array still valid outside this
    // method.
    numbers = new int[10];

    // number[0] is only changed in this method and not the original.
    numbers[0] = 22;
  }
}
