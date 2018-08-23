package io.testoftiramisu.java9recipes.chapter01.recipe05.stringconversion;

/**
 * Demonstrates type conversion from String to double and vice-versa.
 *
 * <p>The representation of {@code String.valueOf(double)} is exactly the one returned by the {@code
 * Double.toString()} method of one argument.
 */
public class StringConversion {

  /**
   * Application main entry point.
   *
   * @param args not used
   */
  public static void main(String... args) {
    double pi;
    String stringValue;

    pi = Double.parseDouble("3.14");

    stringValue = String.valueOf(pi);

    System.out.println(stringValue);
    System.out.println(Double.toString(pi));
  }
}
