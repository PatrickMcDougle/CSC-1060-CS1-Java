/**
 * Code for Class.
 *
 * <p>
 * A program that uses nested for loops to print a multiplication table.
 *
 * <p>
 * CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

public class Ch05Program07 {

  static final int MAX_MULTIPLICATION_NUMBER = 14;
  static final String MULTIPLICATION_TITLE = "Multiplication Table";

  // The program starts the execution from the main method
  public static void main(String[] args) {

    int numberOfSpaces = (MAX_MULTIPLICATION_NUMBER * 4 + 5 - MULTIPLICATION_TITLE.length()) / 2;
    String spaceInTitle = String.format("%%%ds", numberOfSpaces);
    // Display the table heading
    System.out.printf(spaceInTitle, "");

    System.out.println(MULTIPLICATION_TITLE);

    // Display the horizontal numbers in the header row
    System.out.printf("%5s", "");
    for (int j = 1; j <= MAX_MULTIPLICATION_NUMBER; j++) {
      System.out.printf("%4d", j);
    }
    System.out.println();

    System.out.printf("%5s", "-----");
    for (int j = 1; j <= MAX_MULTIPLICATION_NUMBER; j++) {
      System.out.printf("%4s", "----");
    }
    System.out.println();

    // Print table body
    for (int i = 1; i <= MAX_MULTIPLICATION_NUMBER; i++) {
      System.out.printf("%2d | ", i);
      for (int j = 1; j <= MAX_MULTIPLICATION_NUMBER; j++) {
        // Display the product and align properly
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }
  }
}
