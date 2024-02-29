/**
 * Code for Class.
 *
 * <p>The program can guess your birth date. Run to see how it works.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch04;

import java.util.Scanner;

public class Ch04Program03 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    final String YES_OR_NO_PROMPT = "Enter 0 for No and 1 for Yes: ";

    // The following set of numbers are equal to (n % 1) == 1.
    String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";

    // The following set of numbers are equal to (n % 2) == 1.
    String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";

    // The following set of numbers are equal to (n % 4) == 1.
    String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";

    // The following set of numbers are equal to (n % 8) == 1.
    String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";

    // The following set of numbers are equal to (n % 16) == 1.
    String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";

    int day = 0;

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user to answer questions
    System.out.println("Is your birthday in Set1?");
    System.out.println(set1);
    System.out.print(YES_OR_NO_PROMPT);
    int answer = input.nextInt();

    // if (answer == 1) {
    //   day += 1;
    // }
    day += 1 * answer;

    // Prompt the user to answer questions
    System.out.println("\nIs your birthday in Set2?");
    System.out.println(set2);
    System.out.print(YES_OR_NO_PROMPT);
    answer = input.nextInt();

    // if (answer == 1) {
    //   day += 2;
    // }
    day += 2 * answer;

    // Prompt the user to answer questions
    System.out.println("\nIs your birthday in Set3?");
    System.out.println(set3);
    System.out.print(YES_OR_NO_PROMPT);
    answer = input.nextInt();

    // if (answer == 1) {
    //   day += 4;
    // }
    day += 4 * answer;

    // Prompt the user to answer questions
    System.out.println("\nIs your birthday in Set4?");
    System.out.println(set4);
    System.out.print(YES_OR_NO_PROMPT);
    answer = input.nextInt();

    // if (answer == 1) {
    //   day += 8;
    // }
    day += 8 * answer;

    // Prompt the user to answer questions
    System.out.println("\nIs your birthday in Set5?");
    System.out.println(set5);
    System.out.print(YES_OR_NO_PROMPT);
    answer = input.nextInt();

    // if (answer == 1) {
    //   day += 16;
    // }

    day += 16 * answer;

    // The following statement will close the input connection to the console window.
    input.close();

    System.out.println("\nYour birthday is the " + day + "!");
  }
}
