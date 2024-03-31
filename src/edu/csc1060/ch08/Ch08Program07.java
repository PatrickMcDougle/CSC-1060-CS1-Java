/**
 * Code for Class.
 *
 * <p>
 * Ch04Program03.java is a program that guesses a birthday. The program can be simplified by storing
 * the numbers in five sets in a three-dimensional array, and it prompts the user for the answers
 * using a loop.
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

public class Ch08Program07 {
  static final int[][][] DATE_SETS = { // 5 sets of dates
      { // first set
          {1, 3, 5, 7}, {9, 11, 13, 15}, {17, 19, 21, 23}, {25, 27, 29, 31}},
      { // second set
          {2, 3, 6, 7}, {10, 11, 14, 15}, {18, 19, 22, 23}, {26, 27, 30, 31}},
      { // third set
          {4, 5, 6, 7}, {12, 13, 14, 15}, {20, 21, 22, 23}, {28, 29, 30, 31}},
      { // fourth set
          {8, 9, 10, 11}, {12, 13, 14, 15}, {24, 25, 26, 27}, {28, 29, 30, 31}},
      { // fifth set
          {16, 17, 18, 19}, {20, 21, 22, 23}, {24, 25, 26, 27}, {28, 29, 30, 31}}};

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    int day = 0; // Day to be determined
    int answer;

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.println("Is your birth day in Set" + (i + 1) + "?");
      for (int j = 0; j < 4; j++) {
        for (int k = 0; k < 4; k++)
          System.out.printf("%4d", DATE_SETS[i][j][k]);
        System.out.println();
      }

      System.out.print("\nEnter 0 for No and 1 for Yes: ");
      answer = input.nextInt();

      if (answer == 1)
        day += DATE_SETS[i][0][0];
    }

    input.close();

    System.out.println("Your birth day is " + day);
  }
}
