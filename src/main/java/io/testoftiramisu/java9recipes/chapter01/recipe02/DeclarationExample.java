package io.testoftiramisu.java9recipes.chapter01.recipe02;

public class DeclarationExample {

  public static void main(String... args) {
    boolean booleanValue = true; // Default is false

    char charValue = 'G'; // Unicode UTF-16
    charValue = '\u0490'; // Ukrainian letter Ghe(Ґ)

    byte byteValue = 120; //  8 bits, -127 to 127
    short shortValue = 30_000; // 16 bits, -32,768 to 32,768
    int inValue = 35_000_000; // 32 bits, -2147483648 to 2148374647;
    long longValue = 2148374648L; // 64 bits, -(2^64) to 2^64 - 1

    float floatValue = 10.12345F; // 32 bit IEEE 754
    double doubleValue = 10.12345678987654; // 64 bit IEEE 754
  }
}
