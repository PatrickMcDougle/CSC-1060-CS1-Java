/**
 * Code for Class. This program prints Welcome to Java!
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch02;

// This program displays current time in the following format:
// hour:minute:second
public class Ch02Program07 {

  // The program starts the execution from the main method
  public static void main(String[] args) {
    // Obtain the total milliseconds since midnight, Jan 1, 1970
    // The currentTimeMillis method in the System class returns the current time in milliseconds
    // since the midnight, January 1, 1970 GMT. (1970 was the year when the Unix operating system
    // was formally introduced.) You can use this method to obtain the current time
    long totalMilliseconds = System.currentTimeMillis();

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;

    // Compute the current second in the minute in the hour
    long currentSecond = totalSeconds % 60;

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;

    // Obtain the total hours
    long totalHours = totalMinutes / 60;

    // Compute the current hour
    long currentHour = totalHours % 24;

    // Display results
    System.out.println(
        "Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
  }
}
