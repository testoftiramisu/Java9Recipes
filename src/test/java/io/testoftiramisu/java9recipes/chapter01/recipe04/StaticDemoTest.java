package io.testoftiramisu.java9recipes.chapter01.recipe04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
 * Tests usage of static fields with a single value that is
 * shared by all instances of the given class.
 *
 * For illustration purposes only!
 *
 * Beware: References to static methods and fields via class instance rather than a class itself
 * considered as a bad practice and shouldn't be used in production code.
 */
class StaticDemoTest {

  private StaticDemo staticDemoFirstInstance;
  private StaticDemo staticDemoSecondInstance;

  @BeforeEach
  void setUp() {
    staticDemoFirstInstance = new StaticDemo();
    staticDemoSecondInstance = new StaticDemo();
  }

  @AfterEach
  void tearDown() {
    StaticDemo.oneValueForAllObjects = false;
  }

  @Test
  @DisplayName("Boolean field should be initialized as false by default.")
  void booleanFieldDefaultValueIsFalse() {
    assertThat(staticDemoFirstInstance.oneValueForAllObjects).isEqualTo(false);
    assertThat(staticDemoSecondInstance.oneValueForAllObjects).isEqualTo(false);
  }

  @Test
  @DisplayName("Static field value should be the same for all instances of the class.")
  void staticFieldIsCommonForAllInstances() {
    staticDemoFirstInstance.oneValueForAllObjects = true;

    assertThat(staticDemoFirstInstance.oneValueForAllObjects).isTrue();
    assertThat(staticDemoSecondInstance.oneValueForAllObjects).isTrue();
  }
}
