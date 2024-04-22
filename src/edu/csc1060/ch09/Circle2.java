/**
 * Code for Class.
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch09;

// Update the Circle class to have a static number counter.
public class Circle2 {
  // the radius of this circle
  public double radius; // instance variable

  // static variables are shared by all the instances of the class.
  // the number of objects created
  public static int numberOfObjects = 0; // NEW

  // Construct a circle with radius 1
  public Circle2() {
    radius = 1;
    numberOfObjects++; // NEW
  }

  // Construct a circle with a specified radius
  public Circle2(double newRadius) {
    radius = newRadius;
    numberOfObjects++; // NEW
  }

  // Return numberOfObjects
  public static int getNumberOfObjects() { // NEW
    return numberOfObjects;
  }

  // Return the area of this circle
  // PI * radius^2
  public double getArea() {
    return radius * numberOfObjects * Math.PI;
  }

  // Return the perimeter (circumference) of this circle
  // PI * radius * 2
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  // Set a new radius for this circle
  public void setRadius(double newRadius) {
    radius = newRadius;
  }
}
