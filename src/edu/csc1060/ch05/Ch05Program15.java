/**
 * Code for Class.
 *
 * <p>
 * Checks if a string is a palindrome
 *
 * <p>
 * CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

import java.util.Scanner;

public class Ch05Program15 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String s = input.nextLine();

    input.close();

    // The index of the first character in the string
    int low = 0;

    // The index of the last character in the string
    int high = s.length() - 1;

    while (low < high) {
      if (s.charAt(low) != s.charAt(high)) {
        break;
      }

      low++;
      high--;
    }

    if (low >= high) {
      System.out.println(s + " is a palindrome");
    } else {
      System.out.println(s + " is not a palindrome");
    }
  }
}
