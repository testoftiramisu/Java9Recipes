package io.testoftiramisu.java9recipes.chapter01.recipe08;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class JavaDocsExampleTest {
  private static final BigInteger[] BIG_INTEGER_VALUES = {
    BigInteger.TEN, BigInteger.TWO, BigInteger.TWO
  };

  private static final BigInteger EXPECTED_SUM_VALUE = new BigInteger("14");

  /**
   * Checks that {@code addNumbers()} method correctly sums {@link BigInteger} values, provided as
   * array.
   */
  @Test
  void addNumbers() {
    assertThat(JavaDocsExample.addNumbers(BIG_INTEGER_VALUES)).isEqualTo(EXPECTED_SUM_VALUE);
  }
}
