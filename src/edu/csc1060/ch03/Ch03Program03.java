/**
 * Code for Class.
 *
 * <p>This example creates a program to teach a first-grade child how to learn subtractions. The
 * program randomly generates two single-digit integers number1 and number2 with number1 >= number2
 * and displays a question such as “What is 9 – 2?” to the student. After the student types the
 * answer, the program displays whether the answer is correct.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// simple program is an improvement of the Math Learning Tool
public class Ch03Program03 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // 1. Generate two random single-digit integers
    int number1 = (int) (System.currentTimeMillis() % 10);
    int number2 = (int) (System.currentTimeMillis() / 10 % 10);

    // 2. If number1 < number2, swap number1 with number2
    if (number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // 3. Prompt the student to answer "what is number1 + number2?"
    System.out.print("What is " + number1 + " + " + number2 + "? ");

    int answer = input.nextInt();

    // The following statement will close the input connection to the console window.
    input.close();

    // 4. Grade the answer and display the result
    if (number1 - number2 == answer) {
      System.out.println("You are correct!");
      System.out.print(number1 + " + " + number2 + " is " + answer);
    } else {
      System.out.println("Your answer is wrong.");
      System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
    }
  }
}
