/**
 * Code for Class.
 *
 * <p>
 * Suppose that the tuition for a university is $10,000 this year and tuition increases 7% every
 * year. In how many years will the tuition be doubled?
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
public class Ch05Program10 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    double tuition = 10_000; // Year 0
    int year = 0;

    do {
      tuition = tuition * 1.07;
      year++;
    } while (tuition < 20_000);

    System.out.println("Tuition will be doubled in " + year + " years");
    System.out.printf("Tuition will be $%.2f in %d years", tuition, year);
  }
}
