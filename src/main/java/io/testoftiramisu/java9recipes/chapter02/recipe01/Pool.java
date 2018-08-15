package io.testoftiramisu.java9recipes.chapter02.recipe01;

public interface Pool {

  /** Calculates volume (gal) for a fixed depth square or rectangular pool. */
  public default double squareOrRectPoolConstantDepth(double length, double width, double depth) {
    return volumeCalculation(length, width, depth);
  }

  /** Calculates volume (gal) for a variable depth square or rectangular pool. */
  public default double squareOrRectVariableDepth(
      double length, double width, double shallowDepth, double middleDepth, double deepDepth) {
    double averageDepth = (shallowDepth + middleDepth + deepDepth) / 3;
    return volumeCalculation(length, width, averageDepth);
  }

  /** Standard square or rectangular volume calculation. */
  private double volumeCalculation(double length, double width, double depth) {
    return length * width * depth * 7.5;
  }
}
