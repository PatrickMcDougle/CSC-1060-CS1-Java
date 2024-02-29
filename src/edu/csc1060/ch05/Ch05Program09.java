/**
 * Code for Class.
 *
 * <p>
 * A program that prompts the user to enter two positive integers and finds their greatest common
 * divisor.
 *
 * <p>
 * Solution: Suppose you enter two integers 4 and 2, their greatest common divisor is 2. Suppose you
 * enter two integers 16 and 24, their greatest common divisor is 8. So, how do you find the
 * greatest common divisor? Let the two input integers be n1 and n2. You know number 1 is a common
 * divisor, but it may not be the greatest commons divisor. So you can check whether k (for k = 2,
 * 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
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

// Finding the Greatest Common Divisor
public class Ch05Program09 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();

    input.close();

    int gcd = 1;
    int k = 2;
    while (k <= n1 && k <= n2) {
      if (n1 % k == 0 && n2 % k == 0) {
        gcd = k;
      }
      k++;
    }

    System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
  }
}
