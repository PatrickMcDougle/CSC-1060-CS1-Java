/**
 * Code for Class.
 *
 * <p>Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
 * weight in kilograms and dividing by the square of your height in meters. The interpretation of
 * BMI for people 16 years or older is as follows:
 *
 * <ul>
 *   <li>BMI < 18.5 = Underweight
 *   <li>18.5 <= BMI < 25.0 = Normal
 *   <li>25.0 <= BMI < 30.0 = Overweight
 *   <li>30.0 <= BMI = Obese
 * </ul>
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Body Mass Index (BMI) program.
public class Ch03Program04 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter weight in pounds
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    // Prompt the user to enter height in inches
    System.out.print("Enter height in inches: ");
    double height = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
    final double METERS_PER_INCH = 0.0254; // Constant

    // Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);

    // Display result
    System.out.println("BMI is " + bmi);

    if (bmi < 18.5) System.out.println("Underweight");
    else if (bmi < 25) System.out.println("Normal");
    else if (bmi < 30) System.out.println("Overweight");
    else System.out.println("Obese");
  }
}
