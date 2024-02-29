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

public class Ch06Program02 {

  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    int k = signWithAnIssues(i); // Invoke max method
    System.out.println("The maximum between " + i + " and " + j + " is " + k);
  }

  /**
   * A return statement is required for a value-returning method. The method shown below in (a) is
   * logically correct, but it has a compilation error because the Java compiler thinks it possible
   * that this method does not return any value.
   *
   *
   * @param num the number to test for.
   * @return a 1 if the number is positive, 0 if the number is zero and -1 if the number is
   *         negative.
   */
  public static int signWithAnIssues(int num) {

    if (num > 0) {
      return 1;
    } else if (num == 0) {
      return 0;
    } else if (num < 0) {
      return -1;
    }
  }

  public static int signWithoutAnIssues(int num) {

    if (num > 0) {
      return 1;
    } else if (num == 0) {
      return 0;
    } else {
      return -1;
    }
  }

  public static int signWithoutAnIssuesBetter(int num) {
    if (num > 0) {
      return 1;
    }

    if (num == 0) {
      return 0;
    }

    return -1;
  }
}
