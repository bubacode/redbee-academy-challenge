package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CompareNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    Integer result = CompareNumbers.max(1, 3, 2);
    assertNotNull(result, "The result cannot be null");
    assertEquals(3, result);

    Integer anotherResult = CompareNumbers.max(3, 1, 2);
    assertNotNull(anotherResult, "The result cannot be null");
    assertEquals(3, anotherResult);

    Integer finalResult = CompareNumbers.max(1, 2, 3);
    assertNotNull(finalResult, "The result cannot be null");
    assertEquals(3, finalResult);
  }

  @Test
  @DisplayName("Tests happy path")
  public void testEquals() {
    Integer result = CompareNumbers.max(1, 1, 1);
    assertNotNull(result, "The result cannot be null");
    assertEquals(1, result);
  }

  @Test
  @DisplayName("Test when null values are sent")
  public void testNullValues() {
    Integer result = CompareNumbers.max(null, 2, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(2, result);
  }
  @Test
  @DisplayName("Test when two null values are sent")
  public void testTwoNullValues() {
    Integer result = CompareNumbers.max(null, 2, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(2, result);

    Integer anotherResult = CompareNumbers.max(2, null, null);
    assertNotNull(anotherResult, "The result cannot be null");
    assertEquals(2, anotherResult);

    Integer finalResult = CompareNumbers.max(null, null, 2);
    assertNotNull(finalResult, "The result cannot be null");
    assertEquals(2, finalResult);
  }

  @Test
  @DisplayName("Test when three null values are sent")
  public void testThreeNullValues() {
    Integer result = CompareNumbers.max(null, null, null);
    assertNotNull(result, "The result cannot be null");
    assertEquals(0, result);
  }
}
