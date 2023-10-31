package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TomorrowTest {
  @ParameterizedTest
  @CsvSource({"2023, 1, 2, 2023, 1, 3",
          "2023, 9, 30, 2023, 10, 1",
          "2023, 10, 31, 2023, 11, 1 ",
          "2023, 2, 28, 2023, 3, 1",
          "2024, 2, 28, 2024, 2, 29"})
  public void testTomorrow(int year, int month, int day, int y2, int m2, int d2) {
    Tomorrow today = new Tomorrow(year, month, day);
    Tomorrow tomorrow = new Tomorrow(y2, m2, d2);
    assertEquals(today.getTomorrow(), tomorrow.getToday());
  }

}