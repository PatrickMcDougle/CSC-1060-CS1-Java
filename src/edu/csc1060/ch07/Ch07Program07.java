/**
 * Code for Class.
 *
 * <p>
 * You can pass a variable number of arguments of the same type to a method
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program07 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    printMax(new double[] {10, 20, 40, 50, 30});
    printMax(11, 21, 41, 51, 31);
    printMax(12, 22, 42, 52, 32);
  }

  /**
   *
   * @param numbers
   */
  public static void printMax(double... numbers) {
    if (numbers.length == 0) {
      System.out.println("No argument passed");
      return;
    }

    double result = numbers[0];

    for (int i = 1; i < numbers.length; i++)
      if (numbers[i] > result)
        result = numbers[i];

    System.out.println("The max value is " + result);
  }

}
