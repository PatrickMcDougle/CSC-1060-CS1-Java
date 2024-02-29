/**
 * Code for Class.
 *
 * <p>Hexadecimals are often used in computer systems programming (see Appendix F for an
 * introduction to number systems). How do you convert a decimal number to a hexadecimal number? To
 * convert a decimal number d to a hexadecimal number is to find the hexadecimal digits hn, hn-1,
 * hn-2, ... , h2, h1, and h0 such that
 *
 * <p>d = hn*16^n + hn-1 * 16^(n-1) + ... + h2*16^2 + h1*16^1 + h0*16^0
 *
 * <p>These hexadecimal digits can be found by successively dividing d by 16 until the quotient is
 * 0. The remainders are h0, h1, h2, ... , hn-2, hn-1, and hn.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

import java.util.Scanner;

// Future Tuition
public class Ch05Program11 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a decimal integer
    System.out.print("Enter a decimal number: ");
    int decimal = input.nextInt();

    input.close();

    // Convert decimal to hex
    String hex = "";

    while (decimal != 0) {
      int hexValue = decimal % 16;

      // Convert a decimal value to a hex digit
      char hexDigit =
          (0 <= hexValue && hexValue <= 9) ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

      hex = hexDigit + hex;
      decimal = decimal / 16;
    }

    System.out.println("The hex number is " + hex);
  }
}
