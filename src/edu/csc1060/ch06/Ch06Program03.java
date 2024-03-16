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

public class Ch06Program03 {

  public static void main(String[] args) {
    System.out.print("The grade is ");
    printGrade(78.5);

    System.out.print("The grade is ");
    printGrade(59.5);
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
