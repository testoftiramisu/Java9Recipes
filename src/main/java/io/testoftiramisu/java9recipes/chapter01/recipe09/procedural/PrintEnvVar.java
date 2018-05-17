package io.testoftiramisu.java9recipes.chapter01.recipe09.procedural;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

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
  private static String input = "";
  private static boolean exit = false;

  /**
   * Application main entry point.
   *
   * @param args name of the requested environmental variable
   */
  public static void main(String... args) {

    if (args.length > 0) {
      input = System.getenv(args[0].toUpperCase());

      if (input != null) {
        System.out.println(input + " = " + input);
      } else {
        System.out.println("No such environment variable exists");
      }
      System.exit(0);
    }

    BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
    printHelp();

    do {
      System.out.print("> ");
      try {
        input = inputReader.readLine();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
      Command command = checkInput(input);
      printOutput(command);
    } while (!exit);
  }

  private static Command checkInput(String input) {
    switch (input) {
      case "":
        return Command.ERROR;
      case "/list":
        return Command.LIST;
      case "/help":
        return Command.HELP;
      case "/exit":
        return Command.EXIT;
      default:
        return Command.VARIABLE;
    }
  }

  private static void printHelp() {
    System.out.println("/list for listing all available Environment Variables.");
    System.out.println("/help for showing this message again.");
    System.out.println("/exit for exiting the application. ");
    System.out.println("Please input the name of environment variable:");
  }

  private static void printOutput(Command command) {
    switch (command) {
      case LIST:
        Map<String, String> variables = System.getenv();
        for (String variable : variables.keySet()) {
          System.out.println(variable + " = " + variables.get(variable));
        }
        break;
      case HELP:
        printHelp();
        break;
      case VARIABLE:
        String value = System.getenv(input.toUpperCase());
        if (value != null) {
          System.out.println(input.toUpperCase() + " = " + value);
        } else {
          System.out.println("No such environment variable exist.");
        }
        break;
      case ERROR:
        System.out.println("Incorrect input.");
        break;
      case EXIT:
        exit = true;
    }
  }
}
