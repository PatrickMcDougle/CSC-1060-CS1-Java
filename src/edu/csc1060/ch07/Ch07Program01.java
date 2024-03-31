/**
 * Code for Class.
 *
 * <p>
 * Read one hundred numbers, compute their average, and find out how many numbers are above the
 * average.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program01 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    analyzeNumbers();
  }


  /**
   * This method asks for a set of numbers. Than calculates the average. Than counts the number of
   * values above the average.
   */
  public static void analyzeNumbers() {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("Enter the number of items: ");
    int n = input.nextInt();
    double[] numbers = new double[n]; // Create an array
    double sum = 0;

    System.out.print("Enter the numbers: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = input.nextDouble();
      sum += numbers[i];
    }

    input.close();

    double average = sum / n;

    // The numbers of elements above average
    int count = 0;

    for (double item : numbers) {
      if (item > average) {
        count++;
      }
    }

    System.out.println("Average is " + average);
    System.out.println("Number of elements above the average is " + count);
  }
}
