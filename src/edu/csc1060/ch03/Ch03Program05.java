/**
 * Code for Class.
 *
 * <p>The US federal personal income tax is calculated based on the filing status and taxable
 * income. There are four filing statuses: single filers, married filing jointly, married filing
 * separately, and head of household. The tax rates for 2024 are shown below.
 *
 * <p>CSC 1060 - Computer Science 1 - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch03;

import java.util.Scanner;

// Computing Your Taxes
public class Ch03Program05 {

  // The program starts the execution from the main method
  public static void main(String[] args) {

    // Create a Scanner Object
    // The following statement creates an object for performing console input and assigns the object
    // to the reference variable named input.
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter filing status
    System.out.print(
        "Your filing status is ("
            + "0-single, "
            + "1-married jointly, "
            + "2-married separately, "
            + "3-head of household"
            + "): ");

    int status = input.nextInt();

    // Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    // The following statement will close the input connection to the console window.
    input.close();

    // Compute tax
    double tax = 0;

    if (status == 0) { // Compute tax for single filers
      if (income <= 11_600) {
        tax = income * 0.10;
      } else if (income <= 47_150) {
        tax = 11_600 * 0.10 + (income - 11_600) * 0.12;
      } else if (income <= 100_525) {
        tax = 11_600 * 0.10 + (47_150 - 11_600) * 0.12 + (income - 47_150) * 0.22;
      } else if (income <= 191_950) {
        tax =
            11_600 * 0.10
                + (47_150 - 11_600) * 0.12
                + (100_525 - 47_150) * 0.22
                + (income - 100_525) * 0.24;
      } else if (income <= 243_725) {
        tax =
            11_600 * 0.10
                + (47_150 - 11_600) * 0.12
                + (100_525 - 47_150) * 0.22
                + (191_950 - 100_525) * 0.24
                + (income - 191_950) * 0.32;
      } else if (income <= 609_350) {
        tax =
            11_600 * 0.10
                + (47_150 - 11_600) * 0.12
                + (100_525 - 47_150) * 0.22
                + (191_950 - 100_525) * 0.24
                + (243_725 - 191_950) * 0.32
                + (income - 243_725) * 0.35;
      } else {
        tax =
            11_600 * 0.10
                + (47_150 - 11_600) * 0.12
                + (100_525 - 47_150) * 0.22
                + (191_950 - 100_525) * 0.24
                + (243_725 - 191_950) * 0.32
                + (609_350 - 243_725) * 0.35
                + (income - 609_350) * 0.37;
      }
    } else if (status == 1) { // Compute tax for married file jointly
      if (income <= 23_200) {
        tax = income * 0.10;
      } else {
        tax = 23_200 * 0.10;

        if (income <= 94_300) {
          tax += (income - 23_200) * 0.12;
        } else {
          tax += (94_300 - 23_200) * 0.12;

          if (income <= 201_050) {
            tax += (income - 94_300) * 0.22;
          } else {
            tax += (201_050 - 94_300) * 0.22;

            if (income <= 383_900) {
              tax += (income - 201_050) * 0.24;
            } else {
              tax += (383_900 - 201_050) * 0.24;

              if (income <= 487_450) {
                tax += (income - 383_900) * 0.32;
              } else {
                tax += (487_450 - 383_900) * 0.32;

                if (income <= 731_200) {
                  tax += (income - 487_450) * 0.35;
                } else {
                  tax += (731_200 - 487_450) * 0.35;

                  if (income > 731_200) {
                    tax += (income - 731_200) * 0.37;
                  }
                }
              }
            }
          }
        }
      }
    } else if (status == 2) { // Compute tax for married separately
      // Left as exercise in Programming Exercise 3.13
    } else if (status == 3) { // Compute tax for head of household
      // Left as exercise in Programming Exercise 3.13
    } else {
      System.out.println("Error: invalid status");
      System.exit(1);
    }

    // Display the result
    System.out.println("Tax is " + (int) (tax * 100) / 100.0);
  }
}
