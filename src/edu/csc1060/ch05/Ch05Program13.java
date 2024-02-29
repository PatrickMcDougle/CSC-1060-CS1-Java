/**
 * Code for Class.
 *
 * <p>
 * Example of how to use a continue in a loop. This code will sum all the numbers from 0 to 20, but
 * skip 10 and 11.
 *
 * <p>
 * CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;


// Future Tuition
public class Ch05Program13 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20) {
      number++;
      if (number == 10 || number == 11) {
        continue;
      }
      sum += number;
    }

    System.out.println("The sum is " + sum);
  }
}
