package io.testoftiramisu.java9recipes.chapter01.recipe01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloMessageTest {

  private static final String DEFAULT_MESSAGE = "DEFAULT MESSAGE";
  private static final String MESSAGE = "ワールド";
  private static final String LOWER_CASE_MESSAGE = "hello world";
  private HelloMessage helloMessage;

  @BeforeEach
  void setUp() {
    helloMessage = new HelloMessage();
  }

  @Test
  @DisplayName("Should return default message.")
  void shouldReturnDefaultMessage() {
    assertThat(helloMessage.getMessage()).isEqualTo(DEFAULT_MESSAGE);
  }

  @Test
  @DisplayName("Should return message in Uppercase")
  void shouldReturnMessageInUppercase() {
    helloMessage.setMessage(LOWER_CASE_MESSAGE);
    assertThat(helloMessage.getMessage()).isEqualTo(LOWER_CASE_MESSAGE.toUpperCase());
  }

  @Test
  @DisplayName("╯°□°）╯")
  void shouldSetMessageValue() {
    helloMessage.setMessage(MESSAGE);
    assertThat(helloMessage.getMessage()).isEqualTo(MESSAGE);
  }
}
