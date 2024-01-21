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

import java.util.Scanner;

// A program to calculate the loan monthly payment.
public class Ch02Program09 {
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Enter yearly interest rate
    System.out.print("Enter yearly interest rate, for example 8.25: ");
    double annualInterestRate = input.nextDouble();

    // Obtain monthly interest rate
    double monthlyInterestRate = annualInterestRate / 1200.0;

    // Enter number of years
    System.out.print("Enter number of years as an integer, for example 5: ");
    int numberOfYears = input.nextInt();

    // Enter loan amount
    System.out.print("Enter loan amount, for example 120000.95: ");
    double loanAmount = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    // Calculate payment
    double monthlyPayment =
        loanAmount
            * monthlyInterestRate
            / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12.0));
    double totalPayment = monthlyPayment * numberOfYears * 12.0;

    // Display results
    System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100.0) / 100.0);
    System.out.println("The total payment is $" + (int) (totalPayment * 100.0) / 100.0);
  }
}
