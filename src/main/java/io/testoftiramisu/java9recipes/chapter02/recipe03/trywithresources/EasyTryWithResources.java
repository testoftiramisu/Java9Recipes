package io.testoftiramisu.java9recipes.chapter02.recipe03.trywithresources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EasyTryWithResources {

  private static String TEXT = "this is an easy Java 9";

  private static void writeFile(BufferedWriter writer, String text) {
    try (writer) {
      writer.write(text);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    try {
      writeFile(new BufferedWriter(new FileWriter("EasyTryWithResources")), TEXT);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
