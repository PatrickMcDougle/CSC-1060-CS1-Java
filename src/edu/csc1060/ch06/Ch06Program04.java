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

public class Ch06Program04 {

  public static void main(String[] args) {
    System.out.println("The grade is " + getGrade(78.5));
    System.out.println("The grade is " + getGrade(59.5));
  }

  /**
   * This method translates the double grade/score value into its equivalent character value.
   *
   * @param score The double value of the score/grade.
   * @return a character that is equivalent to the input value.
   */
  public static char getGrade(double score) {
    if (score >= 90.0) {
      return 'A';
    }
    if (score >= 80.0) {
      return 'B';
    }
    if (score >= 70.0) {
      return 'C';
    }
    if (score >= 60.0) {
      return 'D';
    }
    return 'F';
  }

  /**
   * This method prints the grade/score to the console
   *
   * @param score a double grade/score value.
   */
  public static void printGrade(double score) {
    if (score >= 90.0) {
      System.out.println('A');
    } else if (score >= 80.0) {
      System.out.println('B');
    } else if (score >= 70.0) {
      System.out.println('C');
    } else if (score >= 60.0) {
      System.out.println('D');
    } else {
      System.out.println('F');
    }
  }
}
