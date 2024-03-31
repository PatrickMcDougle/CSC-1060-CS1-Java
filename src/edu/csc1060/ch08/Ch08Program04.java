/**
 * Code for Class.
 *
 * <p>
 * Sudoku Solution Checker. Checks if the given board is a valid solution.
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

public class Ch08Program04 {
  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    // Read a Sudoku solution
    // int[][] grid = readASolution();
    int[][] grid = getASolution();

    System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
  }

  /** Read a Sudoku solution from the console */
  public static int[][] readASolution() {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a Sudoku puzzle solution:");
    int[][] grid = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        grid[i][j] = input.nextInt();
      }
    }

    input.close();

    return grid;
  }

  /**
   *
   * @return
   */
  public static int[][] getASolution() {

    return new int[][] { // Solved Sudoku matrix
        {5, 3, 4, 6, 7, 8, 9, 1, 2}, // row 1
        {6, 7, 2, 1, 9, 5, 3, 4, 8}, // row 2
        {1, 9, 8, 3, 4, 2, 5, 6, 7}, // row 3
        {8, 5, 9, 7, 6, 1, 4, 2, 3}, // row 4
        {4, 2, 6, 8, 5, 3, 7, 9, 1}, // row 5
        {7, 1, 3, 9, 2, 4, 8, 5, 6}, // row 6
        {9, 6, 1, 5, 3, 7, 2, 8, 4}, // row 7
        {2, 8, 7, 4, 1, 9, 6, 3, 5}, // row 8
        {3, 4, 5, 2, 8, 6, 1, 7, 9} // row 9
    };
  }

  /**
   * Check whether a solution is valid
   *
   * @param grid
   * @return
   */
  public static boolean isValid(int[][] grid) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid)) {
          return false;
        }
      }
    }
    return true; // The solution is valid
  }

  /**
   * Check whether grid[i][j] is valid in the grid
   *
   * @param i
   * @param j
   * @param grid
   * @return
   */
  public static boolean isValid(int i, int j, int[][] grid) {
    // checking if the current value at grid[i][j] is valid.
    return isColumnValid(i, j, grid) && isRowValid(i, j, grid) && is3x3BoxValid(i, j, grid);
  }

  public static boolean isRowValid(int i, int j, int[][] grid) {
    // Check whether grid[i][j] is valid at the j's column
    for (int row = 0; row < 9; row++) {
      if (row != i && grid[row][j] == grid[i][j]) {
        return false;
      }
    }

    return true;
  }

  public static boolean isColumnValid(int i, int j, int[][] grid) {
    // Check whether grid[i][j] is valid at the i's row
    for (int column = 0; column < 9; column++) {
      if (column != j && grid[i][column] == grid[i][j]) {
        return false;
      }
    }

    return true;
  }

  public static boolean is3x3BoxValid(int i, int j, int[][] grid) {
    // Check whether grid[i][j] is valid in the 3 by 3 box
    for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
      for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
        if (!(row == i && col == j) && grid[row][col] == grid[i][j]) {
          return false;
        }
      }
    }

    return true;
  }

}
