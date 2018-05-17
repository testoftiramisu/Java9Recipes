/*
 * Java snippet for execution via JShell.
 *
 * jshell> /open Java9Recipes/Snippet.java
 * jshell> Main.main(null)
 */

class Main {
  public static void main(String[] args) {
    System.out.println("Class inside JShell");
    int index = 0;
    while (index <= 10) {
      System.out.println("Looping: " + index);
      index++;
    }
  }
}
