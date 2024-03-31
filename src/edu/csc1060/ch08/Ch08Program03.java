/**
 * Code for Class.
 *
 * <p>
 * Given a set of points, find the two points that are nearest to each other.
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

public class Ch08Program03 {

  public static final int X = 0;
  public static final int Y = 1;

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {

    double[][] points = getPoints();

    // p1 and p2 are the indices in the points array.
    // Assume points at location 0 and 1 are the closest.
    int p1 = 0;
    int p2 = 1;

    // Initialize shortestDistance
    double shortestDistance = distance(points[p1][X], points[p1][Y], points[p2][X], points[p2][Y]);

    // Compute distance for every two points
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        // Find distance
        double distance = distance(points[i][X], points[i][Y], points[j][X], points[j][Y]);
        double distance2 = distance(points[i], points[j]);

        if (distance != distance2) {
          System.err.println("Distance calculations are not correct.");
        }

        if (shortestDistance > distance) {
          p1 = i; // Update p1
          p2 = j; // Update p2
          shortestDistance = distance; // Update shortestDistance
        }
      }
    }

    // Display result
    System.out.println("The closest two points are " + "(" + points[p1][X] + ", " + points[p1][Y]
        + ") and (" + points[p2][X] + ", " + points[p2][Y] + ")");
  }

  /**
   * Get the points from the user/console
   *
   * @return a 2D array of points.
   */
  public static double[][] getPoints() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of points: ");
    int numberOfPoints = input.nextInt();

    // Create an array to store points
    double[][] points = new double[numberOfPoints][2];
    System.out.print("Enter " + numberOfPoints + " points: ");
    for (int i = 0; i < points.length; i++) {
      points[i][X] = input.nextDouble();
      points[i][Y] = input.nextDouble();
    }
    input.close();

    return points;
  }


  /**
   * Compute the distance between two points (x1, y1) and (x2, y2).
   *
   * @param x1
   * @param y1
   * @param x2
   * @param y2
   * @return
   */
  public static double distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }

  /**
   * Compute the distance between two points: points1 and point2.
   *
   * @param point1
   * @param point2
   * @return
   */
  public static double distance(double[] point1, double[] point2) {
    return Math.sqrt((point2[X] - point1[X]) * (point2[X] - point1[X])
        + (point2[Y] - point1[Y]) * (point2[Y] - point1[Y]));
  }

  /**
   * Compute the distance between two points: points1 and point2. This is an alternate version of
   * the method.
   *
   * @param point1
   * @param point2
   * @return
   */
  public static double distanceV2(double[] point1, double[] point2) {
    return distance(point1[X], point1[Y], point2[X], point2[Y]);
  }

}
