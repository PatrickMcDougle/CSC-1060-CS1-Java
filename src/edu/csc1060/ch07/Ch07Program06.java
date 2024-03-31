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

public class Ch07Program06 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    // Declare and create an array
    char[] chars = createArray();

    // Display the array
    System.out.println("The lowercase letters are:");
    displayArray(chars);

    // Count the occurrences of each letter
    int[] counts = countLetters(chars);

    // Display counts
    System.out.println();
    System.out.println("The occurrences of each letter are:");
    displayCounts(counts);


    // Use our old friend printArray to print this array. Minor tweaks.
    printArray("chars is ", chars);
  }

  /**
   * Create an array of characters
   *
   * @return
   */
  public static char[] createArray() {
    // Declare an array of characters and create it
    char[] chars = new char[2600];

    // Create lowercase letters randomly and assign
    // them to the array
    for (int i = 0; i < chars.length; i++) {
      chars[i] = RandomCharacter.getRandomLowerCaseLetter();
    }

    // Return the array
    return chars;
  }

  /**
   * Display the array of characters
   *
   * @param chars
   */
  public static void displayArray(char[] chars) {
    // Display the characters in the array 20 on each line
    for (int i = 0; i < chars.length; i++) {
      if ((i + 1) % 40 == 0) {
        System.out.println(chars[i]);
      } else {
        System.out.print(chars[i] + " ");
      }
    }
  }

  /**
   * Count the occurrences of each letter
   *
   * @param chars
   * @return
   */
  public static int[] countLetters(char[] chars) {
    // Declare and create an array of 26 int
    int[] counts = new int[26];

    // For each lowercase letter in the array, count it
    for (int i = 0; i < chars.length; i++) {
      counts[chars[i] - 'a']++;
    }

    return counts;
  }

  /**
   * Display counts
   *
   * @param counts
   */
  public static void displayCounts(int[] counts) {
    System.out.println("char | count");
    System.out.println("-----+------");
    for (int i = 0; i < counts.length; i++) {
      System.out.println(String.format("  %c  | %4d", (char) (i + 'a'), counts[i]));
    }
    System.out.println();
  }


  /**
   *
   * @param header
   * @param array
   */
  public static void printArray(String header, char[] array) {
    boolean isFirstLoop = true;
    System.out.print(header + "[");
    for (char i : array) {
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
