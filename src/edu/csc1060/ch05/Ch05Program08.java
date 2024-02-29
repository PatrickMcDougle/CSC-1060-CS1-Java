/**
 * Code for Class.
 *
 * <p>Numeric errors involving floating-point numbers are inevitable. This example shows how to
 * minimize such errors.
 *
 * <p>Here is an example that sums a series that starts with 0.01 and ends with 1.0. The numbers in
 * the series will increment by 0.01, as follows: 0.01 + 0.02 + 0.03 and so on.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

public class Ch05Program08 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Initialize sum
    float floatSum = 0.0f;

    // Add 0.01, 0.02, ..., 0.99, 1 to sum
    for (float f = 0.01f; f <= 1.0f; f += 0.01f) {
      floatSum += f;
    }

    // Display result
    System.out.println("The float sum  : " + floatSum);

    int intSum = 0;

    for (int i = 1; i <= 100; i++) {
      intSum += i;
    }
    // Display result
    System.out.println("The int sum    : " + intSum * 0.01);

    // Initialize sum
    double doubleSum = 0.0;

    // Add 0.01, 0.02, ..., 0.99, 1 to sum
    for (double d = 0.01; d <= 1.0; d += 0.01) {
      doubleSum += d;
    }

    // Display result
    System.out.println("The double sum : " + doubleSum);
  }
}
