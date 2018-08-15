package io.testoftiramisu.java9recipes.chapter01.recipe09.oop;

import java.util.Map;

class App {

  private boolean exit = false;

  /** Returns true of the /exit was provided as an input. */
  boolean isExit() {
    return exit;
  }

  /** Prints list of available commands. */
  String help() {
    return "/list for listing all available Environment Variables.\n"
        + "/help for showing this message again.\n"
        + "/exit for exiting the application. ";
  }

  /**
   * Validates user input and returns list of environment variables, help information, message about
   * incorrect input or value of given environment variable if such variable exist in system.
   *
   * @param input from command line as a String
   */
  String checkInput(String input) {
    switch (input) {
      case "/list":
        Map<String, String> variables = System.getenv();
        String result = "";
        for (String variable : variables.keySet()) {
          result = variable + " = " + variables.get(variable) + "\n";
        }
        return result;
      case "/help":
        return help();
      case "":
        return "Incorrect input.";
      case "/exit":
        exit = true;
        return "";
      default:
        String value = System.getenv(input.toUpperCase());
        if (value != null) {
          return input.toUpperCase() + " = " + value;
        } else {
          return "No such environment variable exist.";
        }
    }
  }
}
