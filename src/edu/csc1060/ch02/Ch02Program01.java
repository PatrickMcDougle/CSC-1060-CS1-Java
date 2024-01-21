/**
 * Code for Class. This program prints Welcome to Java!
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch02;

// Computing the Area of a Circle
public class Ch02Program01 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // The following statement declares a variable radius to be a real number.   The memory space
    // is now allocated for radius and has a default value of 0.
    double radius;
    // The following statement declares a variable area to be a real number.   The memory space
    // is now allocated for radius and has a default value of 0.
    double area;

    // The following statement will assign a value of 20.0 to the variable radius.
    radius = 20.0; // radius is now 20.0

    // The following statement will evaluate the expression and assign the results to the variable
    // area.
    area = radius * radius * 3.141592653589793; // area is now 1256.6370614359173

    // The following statement will concatenate the strings and display that string.
    System.out.println("A Circle with radius " + radius + " has an area of " + area);

    // The main method exits.  The program is finished.
  } // the end of main.
}
