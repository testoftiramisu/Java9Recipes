package io.testoftiramisu.java9recipes.chapter01.recipe04;

class StaticDemo {
  static boolean oneValueForAllObjects;
}

public class StaticFieldsExample {

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
