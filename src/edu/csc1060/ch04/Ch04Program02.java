/**
 * Code for Class.
 *
 * <p>Comparing Strings
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch04;

import java.util.Scanner;

public class Ch04Program02 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two cities
    System.out.print("Enter the first city: ");
    String city1 = input.nextLine();
    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();

    // The following statement will close the input connection to the console window.
    input.close();

    if (city1.compareTo(city2) < 0) {
      System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
    } else {
      System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
    }
  }
}
