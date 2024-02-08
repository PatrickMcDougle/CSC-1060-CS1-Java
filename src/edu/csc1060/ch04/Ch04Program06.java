/**
 * Code for Class.
 *
 * <p>This example shows how to use printf to display a table and then some.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch04;

// Lottery Game
public class Ch04Program06 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Display the header of the table
    System.out.printf(
        "%-10s %-10s %-10s %-10s %-10s %n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

    // Display values for 30 degrees
    int degrees = 30;
    double radians = Math.toRadians(degrees);
    System.out.printf(
        "%-10d %-10.4f %-10.4f %-10.4f %-10.4f %n",
        degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    // Display values for 60 degrees
    degrees = 60;
    radians = Math.toRadians(degrees);
    System.out.printf(
        "%-10d %-10.4f %-10.4f %-10.4f %-10.4f %n",
        degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
  }
}
