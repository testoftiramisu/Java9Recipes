package io.testoftiramisu.java9recipes.chapter06.recipe01.hellolambda;

public class HelloLambda {

  /**
   * Creates the lambda, passing a parameter named "text" to the {@link HelloType#hello(String)}
   * method, returning the {@link String}.
   *
   * @param args not used.
   */
  public static void main(String... args) {

    HelloType helloLambda =
        (String text) -> {
          System.out.println("Hello " + text);
        };

    helloLambda.hello("Lambda");
  }

  public interface HelloType {
    /**
     * Function that will be implemented within the lambda.
     *
     * @param text as a {@link String}
     */
    void hello(String text);
  }
}
