/**
 * Code for Class.
 *
 * <p>
 * Demonstration of selection sort
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

import java.util.Arrays;

public class Ch07Program10 {

  public static void main(String[] args) {
    double[] list = {3.4, 3.5, 3.6, 1.1, 1.2, 1.3, 4.5, 4.6, 4.7, 2.3, 2.4, 2.5, 5.6, 5.7, 5.8, 9.9,
        6.7, 6.8, 6.9};

    printArray("Array before sorting ", list);
    selectionSort(list);
    printArray("Array after sorting  ", list);

    // Java has an Arrays.toString() method that will print out the array for us. No need to keep
    // using the method we created at the start of these examples.
    System.out.println(Arrays.toString(list));
  }

  /**
   *
   * @param list
   */
  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // find the minimum in the list[i..list.length-1]
      double currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // swap list[i] with list[currentMinIndex] if necessary
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }

  /**
   *
   * @param header
   * @param array
   */
  public static void printArray(String header, double[] array) {
    boolean isFirstLoop = true;
    System.out.print(header + "[");
    for (double i : array) {
      if (!isFirstLoop) {
        System.out.print(", ");
      } else {
        isFirstLoop = false;
      }
      System.out.print(i);
    }
    System.out.println("]");
  }
}
