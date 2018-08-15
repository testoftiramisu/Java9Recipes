package io.testoftiramisu.java9recipes.chapter01.recipe04;

/**
 * Example of a class with static field – a single value that is shared by all instances of the
 * given class.
 */
class StaticDemo {
  static boolean oneValueForAllObjects;
}

/** Illustrates how static field value is shares by the all class instances. */
public class StaticFieldsExample {

  /**
   * Application main entry point.
   *
   * @param args not used
   */
  public static void main(String... args) {
    StaticDemo staticDemo = new StaticDemo();
    StaticDemo staticDemoTwo = new StaticDemo();

    /*
     * For illustration purposes only!
     *
     * References to static methods and fields via class instance rather than a class itself
     * considered as a bad practice and shouldn't be used in production code.
     */
    System.out.println(staticDemo.oneValueForAllObjects);
    System.out.println(staticDemoTwo.oneValueForAllObjects);

    staticDemo.oneValueForAllObjects = true;

    System.out.println(staticDemo.oneValueForAllObjects);
    System.out.println(staticDemoTwo.oneValueForAllObjects);
  }
}
