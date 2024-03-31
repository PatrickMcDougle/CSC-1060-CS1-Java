/**
 * Code for Class.
 *
 * <p>
 * Suppose a meteorology station records the temperature and humidity at each hour of every day.
 * Then, the meteorology station stores the data for the past ten days in a text file named
 * weather.txt. Each line of the file consists of four numbers that indicate the day, hour,
 * temperature, and humidity. The program will calculate the average daily temperature and humidity
 * for the 10 days.
 *
 * <p>
 * CSC 1060 - Computer Science I - Java
 *
 * @author Patrick McDougle
 * @version %I%, %G%
 * @since 1.0
 */
package edu.csc1060.ch08;

import java.util.Scanner;
import java.util.Random;

public class Ch08Program06 {
  static final int NUMBER_OF_DAYS = 10;
  static final int NUMBER_OF_HOURS = 24;
  static final int TEMPERATURE_DATA = 0;
  static final int HUMIDITY_DATA = 1;

  /**
   * Program starts here.
   *
   * @param args
   */
  public static void main(String[] args) {
    double[][][] data = getWeatherData();

    findDailyAverage(data);

    printWeatherData(data);

  }

  private static void printWeatherData(double[][][] data) {


    for (int day = 0; day < NUMBER_OF_DAYS; day++) {
      System.out.println("=======================");
      System.out.println(" Dy | Hr | TEMP | HUM  ");
      System.out.println("-----------------------");
      for (int hour = 0; hour < NUMBER_OF_HOURS; hour++) {
        System.out.println(String.format(" %2d | %2d | %2.1f | %1.2f", day + 1, hour + 1,
            data[day][hour][TEMPERATURE_DATA], data[day][hour][HUMIDITY_DATA]));
      }
    }
  }

  public static void findDailyAverage(double[][][] data) {
    // Find the average daily temperature and humidity
    for (int i = 0; i < NUMBER_OF_DAYS; i++) {
      double dailyTemperatureTotal = 0;
      double dailyHumidityTotal = 0;
      for (int j = 0; j < NUMBER_OF_HOURS; j++) {
        dailyTemperatureTotal += data[i][j][TEMPERATURE_DATA];
        dailyHumidityTotal += data[i][j][HUMIDITY_DATA];
      }

      // Display result
      System.out.println("Day " + (i + 1) + "'s average temperature is "
          + dailyTemperatureTotal / NUMBER_OF_HOURS);
      System.out.println(
          "Day " + (i + 1) + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
    }

  }

  /**
   *
   * @return
   */
  public static double[][][] getWeatherData() {
    double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

    Random random = new Random(42);

    for (int day = 0; day < NUMBER_OF_DAYS; day++) {
      for (int hour = 0; hour < NUMBER_OF_HOURS; hour++) {
        // random temp from 20 to 100
        double temperature = random.nextDouble() * 80.0 + 20.0;
        double humidity = random.nextDouble();
        data[day][hour][TEMPERATURE_DATA] = temperature;
        data[day][hour][HUMIDITY_DATA] = humidity;
      }
    }

    return data;
  }

  /**
   *
   * @return
   */
  public static double[][][] getWeatherDataFromConsole() {
    double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

    Scanner input = new Scanner(System.in);
    // Read input using input redirection from a file
    for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
      int day = input.nextInt();
      int hour = input.nextInt();
      double temperature = input.nextDouble();
      double humidity = input.nextDouble();
      data[day - 1][hour - 1][TEMPERATURE_DATA] = temperature;
      data[day - 1][hour - 1][HUMIDITY_DATA] = humidity;
    }

    input.close();
    return data;
  }

  /**
   *
   * @return
   */
  public static double[][][] getWeatherDataFromFile() {
    double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

    Scanner input = new Scanner(System.in);
    // Read input using input redirection from a file
    for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
      int day = input.nextInt();
      int hour = input.nextInt();
      double temperature = input.nextDouble();
      double humidity = input.nextDouble();
      data[day - 1][hour - 1][TEMPERATURE_DATA] = temperature;
      data[day - 1][hour - 1][HUMIDITY_DATA] = humidity;
    }

    input.close();
    return data;
  }
}
