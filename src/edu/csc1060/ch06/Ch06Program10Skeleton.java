/**
 * Code for Class.
 *
 * <p>
 * This program demonstrates the stepwise refinement approach.
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

import java.util.Scanner;

public class Ch06Program10Skeleton {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter year
    System.out.print("Enter full year (e.g., 2001): ");
    int year = input.nextInt();

    // Prompt the user to enter month
    System.out.print("Enter month in number between 1 and 12: ");
    int month = input.nextInt();

    input.close();

    // Print calendar for the month of the year
    printMonth(year, month);
  }

  /**
   * Print the calendar for a month in a year
   *
   * @param year
   * @param month
   */
  public static void printMonth(int year, int month) {
    System.out.print(month + " " + year);
  }

  /**
   * Print the month title, e.g., May, 1999
   *
   * @param year
   * @param month
   */
  public static void printMonthTitle(int year, int month) {}

  /**
   * Get the English name for the month
   *
   * @param month
   * @return
   */
  public static String getMonthName(int month) {
    return "January"; // A dummy value
  }

  /**
   * Print month body
   *
   * @param year
   * @param month
   */
  public static void printMonthBody(int year, int month) {}

  /**
   * Get the start day of month/1/year
   *
   * @param year
   * @param month
   * @return
   */
  public static int getStartDay(int year, int month) {
    return 1; // A dummy value
  }

  /**
   * Get the total number of days since January 1, 1800
   *
   * @param year
   * @param month
   * @return
   */
  public static int getTotalNumberOfDays(int year, int month) {
    return 10000; // A dummy value
  }

  /**
   * Get the number of days in a month
   *
   * @param year
   * @param month
   * @return
   */
  public static int getNumberOfDaysInMonth(int year, int month) {
    return 31; // A dummy value
  }

  /**
   * Determine if it is a leap year
   *
   * @param year
   * @return
   */
  public static boolean isLeapYear(int year) {
    return true; // A dummy value
  }
}
