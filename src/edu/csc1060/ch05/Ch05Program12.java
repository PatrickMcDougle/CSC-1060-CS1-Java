/**
 * Code for Class.
 *
 * <p>
 * Example of how tu use a break in a loop. The code will loop summing up all the numbers from 0 to
 * 20 until the sum is greater than 100 or the number to sum is 20 or higher.
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
public class Ch05Program12 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    int sum = 0;
    int number = 0;

    while (number < 20) {
      number++;
      sum += number;
      if (sum >= 100) {
        break;
      }
    }

    System.out.println("The number is " + number);
    System.out.println("The sum is " + sum);
  }
}
