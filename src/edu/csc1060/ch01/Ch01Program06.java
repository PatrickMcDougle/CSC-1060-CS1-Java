/**
 * Code for Class. This class demonstrates what a logic error is.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch01;

// Demonstrate: Logic Error
public class Ch01Program06 {

  /** Start Method. Yes I know there is a Logic error here. */
  public static void main(String[] args) {

    // formula to convert celsius to fahrenheit is:
    // (C * 9 / 5) + 32
    // 35°C = 95°F
    System.out.println("Celsius 35 converted to Fahrenheit degree:");
    System.out.print("Attempt 1 : ");
    System.out.println((9 / 5) * 35 + 32);

    // first attempt to fix issue based on formula above. -- still wrong
    System.out.print("Attempt 2 : ");
    System.out.println(35 * (9 / 5) + 32);

    // second attempt to fix issue based on formula above. -- now its correct.
    System.out.print("Attempt 3 : ");
    System.out.println((35 * 9 / 5) + 32);

    // another different type of attempt to fix the issue. -- This also fixes it.
    System.out.print("Attempt 4 : ");
    System.out.println((9.0 / 5) * 35 + 32);

    // Why does one formula work and others don't?
  }
}
