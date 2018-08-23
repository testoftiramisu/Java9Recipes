package io.testoftiramisu.java9recipes.chapter01.recipe01.hello;

/**
 * Demonstrates an usage of {@link HelloMessage} class by setting the message value and by showing
 * it to a user via standard output.
 */
public class HelloWorld {

  /**
   * Application main entry point.
   *
   * @param args not used
   */
  public static void main(String... args) {
    HelloMessage helloMessage = new HelloMessage();
    System.out.println(helloMessage.getMessage());

    helloMessage.setMessage("Hello, World!");
    System.out.println(helloMessage.getMessage());
  }
}
