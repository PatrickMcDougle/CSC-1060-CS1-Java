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

// Updating the Circle class to have visibility keywords added.
public class Circle1 {
  // the radius of this circle
  public double radius;

  // Construct a circle with radius 1
  public Circle1() {
    radius = 1;
  }

  // Construct a circle with a specified radius
  public Circle1(double newRadius) {
    radius = newRadius;
  }

  // Return the area of this circle
  // PI * radius^2
  public double getArea() {
    return radius * radius * Math.PI;
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
