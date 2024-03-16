/**
 * Code for Class.
 *
 * <p>
 * Demonstration of binary search
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program09 {

  public static void main(String[] args) {
    int[] list = {4, 5, 6, 7, 8, 12, 34, 56, 78};

    printArray("Binary Search Array ", list);

    int i = binarySearch(list, 45); // returns 1
    int j = binarySearch(list, 78); // returns -1
    int k = binarySearch(list, 6); // returns 5

    System.out.println("Searching for key 45, found at index " + i);
    System.out.println("Searching for key 78, found at index " + j);
    System.out.println("Searching for key 6, found at index " + k);
  }

  /**
   * Use binary search to find the key in the list
   *
   * @param list is an array of integer values.
   * @param key is the key (value) we are looking for in the list.
   * @return the index where the key was found, or a negative value if not found.
   */
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < list[mid]) {
        high = mid - 1;
      } else if (key == list[mid]) {
        return mid;
      } else {
        low = mid + 1;
      }
    }

    // now high < low, key was not found.
    return -low - 1;
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
