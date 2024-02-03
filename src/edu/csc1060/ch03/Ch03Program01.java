/**
 * Code for Class.
 *
 * <p>This example creates a program to let a first-grader practice additions. The program randomly
 * generates two single-digit integers, number1 and number2, and displays a question such as “What
 * is 7 + 9?” to the student. After the student types the answer, the program displays a message to
 * indicate whether the answer is true or false.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Math Learning Tool
public class Ch03Program01 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // 1. Generate two random single-digit integers
    int number1 = (int) (System.currentTimeMillis() % 10);
    int number2 = (int) (System.currentTimeMillis() / 10 % 10);

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // 2. Prompt the student to answer "what is number1 + number2?"
    System.out.print("What is " + number1 + " + " + number2 + "? ");

    int answer = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    // 4. Display the result
    System.out.print(
        number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
  }
}
