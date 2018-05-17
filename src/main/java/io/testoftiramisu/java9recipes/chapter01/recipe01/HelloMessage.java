package io.testoftiramisu.java9recipes.chapter01.recipe01;

/** A simple JavaBeans-Style class for storing {@link String} based message. */
class HelloMessage {
  private String message;

  /** Creates a class instance and sets default value ot message. */
  HelloMessage() {
    message = "Default message";
  }

  /** Returns message converted to upper case. */
  String getMessage() {
    return message.toUpperCase();
  }

  /** Sets the value for the message. */
  void setMessage(String message) {
    this.message = message;
  }
}
