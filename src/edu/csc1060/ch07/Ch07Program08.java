/**
 * Code for Class.
 *
 * <p>
 * Demonstration of linear search
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch07;

public class Ch07Program08 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

    printArray("Linear Search Array ", list);

    int i = linearSearch(4, list); // returns 1
    int j = linearSearch(-4, list); // returns -1
    int k = linearSearch(-3, list); // returns 5

    System.out.println("Searching for key 4, found at index " + i);
    System.out.println("Searching for key -4, found at index " + j);
    System.out.println("Searching for key -3, found at index " + k);
  }

  /**
   *
   * @param key
   * @param list
   * @return
   */
  public static int linearSearch(int key, int[] list) {
    for (int i = 0; i < list.length; i++) {
      if (key == list[i]) {
        // found key return index.
        return i;
      }
    }

    // did not find the key in the list. return -1
    return -1;
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
