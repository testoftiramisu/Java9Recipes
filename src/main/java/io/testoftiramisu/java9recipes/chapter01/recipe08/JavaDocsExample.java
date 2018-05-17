package io.testoftiramisu.java9recipes.chapter01.recipe08;

import java.math.BigInteger;

/** Shows example of JavaDocs usage. */
public class JavaDocsExample {

  /**
   * Accepts an unlimited number of values and return the sum.
   *
   * @param numbers must be an array of BigInteger values
   * @return sum of all numbers in the given array
   */
  public static BigInteger addNumbers(BigInteger[] numbers) {
    BigInteger result = new BigInteger("0");

    for (BigInteger number : numbers) {
      result = result.add(number);
    }
    return result;
  }

  /**
   * Demonstrates result of {@code addNumbers()} method to a user.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    BigInteger[] someValues = {BigInteger.TEN, BigInteger.TWO, BigInteger.TWO};
    System.out.println(addNumbers(someValues));
  }
}
