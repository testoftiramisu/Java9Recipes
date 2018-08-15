package io.testoftiramisu.java9recipes.chapter01.recipe07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Program that keep prompting for input until user enters some characters that represent a valid
 * value of type long.
 */
public class AcceptingInput {

  /**
   * Program main entry point.
   *
   * @param args not used.
   */
  public static void main(String[] args) {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    String numberAsString = "";
    long numberAsLong;
    boolean numberIsValid = false;

    do {
      /* Asks the user for a number. */
      System.out.println("Please enter a number: ");

      try {
        numberAsString = inputReader.readLine();
        System.out.println("You entered: " + numberAsString);
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }

      /* Converts the number into the binary form. */
      try {
        numberAsLong = Long.parseLong(numberAsString);
        numberIsValid = true;
        System.out.println("Parsed number: " + numberAsLong);
      } catch (NumberFormatException ex) {
        System.out.println("It's not a number!\n");
      }
    } while (!numberIsValid);
  }
}
