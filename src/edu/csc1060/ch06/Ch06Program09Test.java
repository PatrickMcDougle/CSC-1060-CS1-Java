/**
 * Code for Class.
 *
 * <p>
 * This program demonstrates random characters
 *
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch06;

public class Ch06Program09Test {
  public static void main(String[] args) {
    final int NUMBER_OF_CHARS = 175;
    final int CHARS_PER_LINE = 25;

    // Print random characters between 'a' and 'z', 25 chars per line
    for (int i = 0; i < NUMBER_OF_CHARS; i++) {
      char ch = Ch06Program09.getRandomLowerCaseLetter();
      if ((i + 1) % CHARS_PER_LINE == 0)
        System.out.println(ch);
      else
        System.out.print(ch);
    }
  }
}
