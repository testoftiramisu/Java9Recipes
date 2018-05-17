package io.testoftiramisu.java9recipes.chapter01.recipe09.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Command line utility that prints value of provided environmental variable to the standard output.
 *
 * <p>Utility works in two modes:
 *
 * <p>1. If argument is provided and such environment variable exist at the system, it value will be
 * printed to to the standard output.
 *
 * <p>2. If argument not provided, utility will work in interactive mode.
 */
public class PrintEnvVar {
  private static final String CLI = "> ";
  private static final String HEADER =
      "Please type the command or the valid name of the environment variable:";
  private static final String NO_VARIABLE_EXISTS_MESSAGE = "No such environment variable exists";
  private static String input = "";

  /** Prints a String and then terminate the line. */
  private static void print(String input) {
    System.out.println(input);
  }

  /**
   * Application main entry point.
   *
   * @param args name of the requested environmental variable
   */
  public static void main(String... args) {
    App app = new App();

    if (args.length > 0) {
      input = System.getenv(args[0].toUpperCase());

      if (input != null) {
        print(input + " = " + input);
      } else {
        print(NO_VARIABLE_EXISTS_MESSAGE);
      }
      System.exit(0);
    }

    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
    print(app.help());
    print(HEADER);

    do {
      print(CLI);
      try {
        input = inputReader.readLine();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
      print(app.checkInput(input));
    } while (app.isExit());
  }
}
