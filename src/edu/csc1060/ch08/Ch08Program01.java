/**
 * Code for Class.
 *
 * <p>
 * You can pass a two-dimensional array to a method just as you pass a one-dimensional array. You
 * can also return an array from a method.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch08;

import java.util.Scanner;

public class Ch08Program01 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    int[][] m = getArray(); // Get an array

    // Display sum of elements
    System.out.println("\nSum of all elements is " + sum(m));
  }

  /**
   * This method will get array values from the user.
   *
   * @return a 2D array (3x4) from the user.
   */
  public static int[][] getArray() {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Enter array values
    int[][] m = new int[3][4];
    System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = input.nextInt();
      }
    }

    input.close();

    return m;
  }

  /**
   * Calculates the total of all the values in the array.
   *
   * @param m a 2D array of values.
   * @return the total of all values in the array.
   */
  public static int sum(int[][] m) {
    int total = 0;
    for (int row = 0; row < m.length; row++) {
      for (int column = 0; column < m[row].length; column++) {
        total += m[row][column];
      }
    }

    return total;
  }
}
