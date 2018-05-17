package io.testoftiramisu.java9recipes.chapter01.recipe07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingInput {
  public static void main(String[] args) {
    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));

    String numberAsString = "";
    long numberAsLong = 0;
    boolean numberIsValid = false;

    do {
      /* Ask the user for a number */
      System.out.println("Please enter a number: ");

      try {
        numberAsString = inputReader.readLine();
        System.out.println("You entered: " + numberAsString);
      } catch (IOException ex) {
        System.out.println(ex.getMessage());
      }

      /* Convert the number into the binary form */
      try {
        numberAsLong = Long.parseLong(numberAsString);
        numberIsValid = true;
      } catch (NumberFormatException ex) {
        System.out.println("It's not a number!\n");
      }
    } while (!numberIsValid);
  }
}
