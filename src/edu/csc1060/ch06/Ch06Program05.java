/**
 * Code for Class.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch06;

public class Ch06Program05 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("**********");
    System.out.println("* Part 1 *");
    System.out.println("**********");
    System.out.println();

    int x = 1;
    System.out.println("Before the call, x is " + x);
    increment(x);
    System.out.println("After the call, x is " + x);

    System.out.println();
    System.out.println("**********");
    System.out.println("* Part 2 *");
    System.out.println("**********");
    System.out.println();

    // Declare and initialize variables
    int num1 = 1;
    int num2 = 2;

    System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

    // Invoke the swap method to attempt to swap two variables
    swap(num1, num2);

    System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    System.out.println();
  }

  /**
   * When parameters are passed into a method, they are passed by value.
   *
   * @param n
   */
  public static void increment(int n) {
    n++;
    System.out.println("n inside the method is " + n);
  }

  /**
   * Swap two variables
   *
   * @param num1
   * @param num2
   */
  public static void swap(int num1, int num2) {
    System.out.println("* Inside the swap method *");
    System.out.println("* Before swapping, num1 is " + num1 + " and num2 is " + num2);

    // Swap n1 with n2
    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("* After swapping, num1 is " + num1 + " and num2 is " + num2);
  }
}
