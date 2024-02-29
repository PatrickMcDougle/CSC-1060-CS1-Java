/**
 * Code for Class.
 *
 * <p>The Math subtraction learning tool program generates just one question for each run. You can
 * use a loop to generate questions repeatedly. This example gives a program that generates five
 * questions and reports the number of the correct answers after a student answers all five
 * questions.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch05;

import java.util.Random;
import java.util.Scanner;

public class Ch05Program04 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    Random random = new Random();

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    final int NUMBER_OF_QUESTIONS = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    String output = ""; // output string is initially empty

    long startTime = System.currentTimeMillis();

    while (count < NUMBER_OF_QUESTIONS) {
      // 1. Generate two random single-digit integers
      int number1 = random.nextInt(10);
      int number2 = random.nextInt(10);

      // 2. If number1 < number2, swap number1 with number2
      if (number1 < number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
      }

      // 3. Prompt the student to answer "What is number1 – number2?"
      System.out.print("What is " + number1 + " - " + number2 + "? ");
      int answer = input.nextInt();

      // 4. Grade the answer and display the result
      if (number1 - number2 == answer) {
        System.out.println("You are correct!\n");
        correctCount++;
      } else {
        System.out.println(
            "Your answer is wrong.\n"
                + number1
                + " - "
                + number2
                + " should be "
                + (number1 - number2)
                + "\n");
      }

      // Increase the count
      count++;

      output +=
          "\n"
              + number1
              + "-"
              + number2
              + "="
              + answer
              + ((number1 - number2 == answer) ? " correct" : " wrong");
    }

    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;

    System.out.println(
        "Correct count is "
            + correctCount
            + "\nTest time is "
            + testTime / 1000
            + " seconds\n"
            + output);

    input.close();
  }
}
