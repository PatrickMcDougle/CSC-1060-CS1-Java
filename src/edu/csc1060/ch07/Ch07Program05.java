/**
 * Code for Class.
 *
 * <p>
 * Demonstrate copy and reversing the order of its values with methods.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program05 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {

    int[] list1 = {1, 2, 3, 4, 5, 6};
    int[] list2 = copyAndReverse(list1);


    // Swap elements using the swap method
    printArray("list1 is ", list1);
    printArray("list2 is ", list2);
  }

  /**
   * make a new array based on the array entered and reverse the order of the values.
   *
   * @param list
   * @return
   */
  public static int[] copyAndReverse(int[] list) {
    int[] result = new int[list.length];

    for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
    }

    return result;
  }

  /**
   *
   * @param header
   * @param array
   */
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
