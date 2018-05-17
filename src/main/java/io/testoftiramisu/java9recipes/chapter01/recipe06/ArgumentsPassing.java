package io.testoftiramisu.java9recipes.chapter01.recipe06;

/** Demonstrates the ability of Java to get command line arguments during the program start. */
public class ArgumentsPassing {

  /** Application main entry point. */
  public static void main(String... args) {
    if (args.length > 0) {
      System.out.println("Arguments passed to the program: ");
      for (String arg : args) {
        System.out.println(arg);
      }
    } else {
      System.out.println("No arguments were passed to the program.");
    }
  }
}
