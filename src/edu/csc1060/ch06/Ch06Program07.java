/**
 * Code for Class.
 *
 * Write a method that converts a hexadecimal number into a decimal number.
 *
 * ABCD => A*16^3 + B*16^2 + C*16^1 + D*16^0
 *
 * ABCD => ((A*16 + B)*16 + C)*16 + D
 *
 * ABCD => ((10*16 + 11)*16 + * 12)*16 + 13 = ?
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch06;

import java.util.Scanner;

public class Ch06Program07 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("**********************");
    System.out.println("* Convert Hex to Dec *");
    System.out.println("**********************");
    System.out.println();

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();

    input.close();

    System.out.println(
        "The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

    System.out.println();
  }

  /**
   *
   * @param hex
   * @return
   */
  public static int hexToDecimal(String hex) {
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }

    return decimalValue;
  }

  /**
   *
   * @param ch
   * @return
   */
  public static int hexCharToDecimal(char ch) {
    if ('A' <= ch && ch <= 'F') {
      return 10 + ch - 'A';
    }

    // ch is '0', '1', ..., or '9'
    return ch - '0';
  }
}
