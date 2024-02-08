/**
 * Code for Class.
 *
 * <p>Write a program that prompts the user to enter the x- and y-coordinates of the three corner
 * points in a triangle and then displays the triangle’s angles.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch04;

import java.util.Scanner;

public class Ch04Program01 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter three points
    System.out.print("Enter three points: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    // Compute three sides
    double sideA = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    double sideB = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
    double sideC = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

    // Compute the squares!
    double sideA2 = sideA * sideA;
    double sideB2 = sideB * sideB;
    double sideC2 = sideC * sideC;

    // Compute three angles
    double angle1 = Math.toDegrees(Math.acos((sideA2 - sideB2 - sideC2) / (-2 * sideB * sideC)));
    double angle2 = Math.toDegrees(Math.acos((sideB2 - sideA2 - sideC2) / (-2 * sideA * sideC)));
    double angle3 = Math.toDegrees(Math.acos((sideC2 - sideB2 - sideA2) / (-2 * sideA * sideB)));

    // Display results
    System.out.println(
        "The three angles are "
            + Math.round(angle1 * 100) / 100.0
            + " "
            + Math.round(angle2 * 100) / 100.0
            + " "
            + Math.round(angle3 * 100) / 100.0);
  }
}
