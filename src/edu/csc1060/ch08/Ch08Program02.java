/**
 * Code for Class.
 *
 * <p>
 * The program grades the test and displays the result. It compares each student’s answers with the
 * key, counts the number of correct answers, and displays it.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch08;

public class Ch08Program02 {

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    char[][] answers = getArray(); // Get an array

    // Key to the questions
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    gradeAnswers(answers, keys);
  }

  /**
   *
   * @param answers
   * @param keys
   */
  private static void gradeAnswers(char[][] answers, char[] keys) {
    // Grade all answers
    for (int student = 0; student < answers.length; student++) {
      // Grade one student
      int correctCount = 0;
      for (int j = 0; j < answers[student].length; j++) {
        if (answers[student][j] == keys[j]) {
          correctCount++;
        }
      }

      System.out.println("Student " + student + "'s correct count is " + correctCount);
    }
  }

  /**
   * This method will get an array needed for this program.
   *
   * @return a 2D array (8x10) from the user.
   */
  private static char[][] getArray() {
    // Students' answers to the questions
    char[][] answers = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    return answers;
  }

}
