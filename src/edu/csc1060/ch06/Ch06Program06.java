/**
 * Code for Class.
 *
 * Methods can be used to reduce redundant coding and enable code reuse. Methods can also be used to
 * modularize code and improve the quality of the program.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch06;

import java.util.Scanner;

public class Ch06Program06 {

  public static void main(String[] args) {
    System.out.println();
    System.out.println("***************************");
    System.out.println("* Greatest Common Divisor *");
    System.out.println("***************************");
    System.out.println();

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int n2 = input.nextInt();

    input.close();

    System.out
        .println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));

    System.out.println();
    System.out.println("*****************");
    System.out.println("* Prime Numbers *");
    System.out.println("*****************");
    System.out.println();

    System.out.println("The first 50 prime numbers are \n");
    printPrimeNumbers(50);

    System.out.println();
  }

  /**
   * Return the gcd of two integers
   *
   * @param n1
   * @param n2
   * @return
   */
  public static int gcd(int n1, int n2) {
    int gcd = 1; // Initial gcd is 1
    int k = 1; // Possible gcd

    while (k <= n1 && k <= n2) {
      if (n1 % k == 0 && n2 % k == 0) {
        // Update gcd
        gcd = k;
      }
      k++;
    }

    return gcd; // Return gcd
  }


  /**
   *
   * @param numberOfPrimes
   */
  public static void printPrimeNumbers(int numberOfPrimes) {
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness

    // Repeatedly find prime numbers
    while (count < numberOfPrimes) {
      // Print the prime number and increase the count
      if (isPrime(number)) {
        // Increase the count
        count++;

        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Print the number and advance to the new line
          System.out.printf("%-5d%n", number);
        } else {
          System.out.printf("%-5d", number);
        }
      }

      // Check if the next number is prime
      number++;
    }
  }

  /**
   * Check whether number is prime
   *
   * @param number
   * @return
   */
  public static boolean isPrime(int number) {
    for (int divisor = 2; divisor <= number / 2; divisor++) {
      // If true, number is not prime
      if (number % divisor == 0) {
        // number is not a prime
        return false;
      }
    }

    // number is prime
    return true;
  }
}
