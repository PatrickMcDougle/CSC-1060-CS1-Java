/**
 * Code for Class.
 *
 * <p>
 * This program calculates the total score for students in a class. Suppose the scores are stored in
 * a three-dimensional array named scores. The first index in scores refers to a student, the second
 * refers to an exam, and the third refers to the part of the exam. Suppose there are: 7 students, 5
 * exams, and each exam has two parts (multiple-choice and the programming part). So,
 * scores[i][j][0] represent the score on the multiple-choice part for the i’s student on the j’s
 * exam. The program shall display the total score for each student.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch08;

public class Ch08Program05 {
  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    double[][][] scores = getScores();

    // Calculate and display total score for each student
    for (int student = 0; student < scores.length; student++) {
      double totalScore = 0;
      for (int exam = 0; exam < scores[student].length; exam++) {
        for (int k = 0; k < scores[student][exam].length; k++) {
          totalScore += scores[student][exam][k];
        }
      }

      System.out.println("Student " + student + "'s score is " + totalScore);
    }
  }

  /**
   *
   * @return
   */
  public static double[][][] getScores() {

    return new double[][][] { // the scores
        {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
        {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
        {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
        {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
        {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
        {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}},
        {{5.0, 15.0}, {5.0, 15.0}, {05, 15.0}, {05, 15.0}, {05, 5.0}},
        {{5.0, 15.0}, {5.0, 15.0}, {05, 15.0}, {05, 15.0}, {05, 5.0}, {05, 5.0}}, // one more exam
                                                                                  // the other
                                                                                  // students
        {{5.0, 15.0}, {5.0, 15.0}, {05, 15.0}, {05, 15.0}}, // one less exam then the other students
        {{5.0, 15.0}, {5.0, 15.0}, {05, 15.0}, {05, 15.0}, {05, 5.0, 1.0}}, // student received a
                                                                            // third score on the
                                                                            // exam.
        {{1.5, 29.5}, {6.4, 22.5}, {14, 30.5}, {10, 30.5}, {16, 6.0}}};
  }
}
