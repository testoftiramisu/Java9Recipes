package io.testoftiramisu.java9recipes.chapter01.recipe03.visibility;

/** An example of how to control field visibility with private keyword. */
class InnerClass {
  double visibleFromEntirePackage;
  private long visibleOnlyInThisClass;

  long getLong() {
    return visibleOnlyInThisClass;
  }

  void setLong(long value) {
    visibleOnlyInThisClass = value;
  }
}

/**
 * Demonstrates an access to class field that visible from entire package and to the field that
 * accessible only trough getter and setter.
 */
public class VisibilityExample {

  private static final double PI = 3.14159265359;

  public static void main(String... args) {
    InnerClass innerClass = new InnerClass();
    innerClass.setLong(123456);
    innerClass.setLong(654321);
    innerClass.visibleFromEntirePackage = PI;

    System.out.println("InnerClass.getLong() returns: " + innerClass.getLong());
    System.out.println("visibleFromEntirePackage = " + innerClass.visibleFromEntirePackage);
  }
}
