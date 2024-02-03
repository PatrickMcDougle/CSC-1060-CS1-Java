/**
 * Code for Class.
 *
 * <p>Chinese Zodiac: Write a program that prompts the user to enter a year and displays the animal
 * for the year.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Chinese Zodiac
public class Ch03Program10 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    switch (year % 12) {
      case 0:
        System.out.println("monkey");
        break;
      case 1:
        System.out.println("rooster");
        break;
      case 2:
        System.out.println("dog");
        break;
      case 3:
        System.out.println("pig");
        break;
      case 4:
        System.out.println("rat");
        break;
      case 5:
        System.out.println("ox");
        break;
      case 6:
        System.out.println("tiger");
        break;
      case 7:
        System.out.println("rabbit");
        break;
      case 8:
        System.out.println("dragon");
        break;
      case 9:
        System.out.println("snake");
        break;
      case 10:
        System.out.println("horse");
        break;
      case 11:
        System.out.println("sheep");
        break;
      default:
        System.out.println("???");
    }
  }
}
