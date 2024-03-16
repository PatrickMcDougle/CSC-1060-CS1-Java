/**
 * Code for Class.
 *
 * <p>
 * Demonstrate differences of passing primitive data type variables and array variables.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program04 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    int[] a = {1, 2};

    // Swap elements using the swap method
    printArray("Before invoking swap\narray is ", a);
    swap(a[0], a[1]);
    printArray("After invoking swap\narray is ", a);

    // Swap elements using the swapFirstTwoInArray method
    printArray("Before invoking swapFirstTwoInArray\narray is ", a);
    swapFirstTwoInArray(a);
    printArray("After invoking swapFirstTwoInArray\narray is ", a);
  }

  /**
   * Swap two variables
   *
   * @param n1
   * @param n2
   */
  public static void swap(int n1, int n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
  }

  /**
   * Swap the first two elements in the array
   *
   * @param array
   */
  public static void swapFirstTwoInArray(int[] array) {
    int temp = array[0];
    array[0] = array[1];
    array[1] = temp;
  }

  public static void printArray(String header, int[] array) {
    boolean isFirstLoop = true;
    System.out.print(header + "[");
    for (int i : array) {
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
