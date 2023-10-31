package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeekIn2021Test {
  @ParameterizedTest
  @CsvSource({"1, 1, 5", "2, 28, 7", "2, 29, 0"}) // 月、日、星期幾
  public void testDayOfWeekIn2021(int month, int day, int week){
    DayOfWeekIn2021 dayOfWeekIn2021 = new DayOfWeekIn2021();
    dayOfWeekIn2021.setDate(month, day);
    int result = dayOfWeekIn2021.getDayOfWeek();
    assertEquals(week, result);
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/test.csv") // 月、日、星期幾
  public void testDayOfWeekIn2021WithFile(int month, int day, int week){
    DayOfWeekIn2021 dayOfWeekIn2021 = new DayOfWeekIn2021();
    dayOfWeekIn2021.setDate(month, day);
    int result = dayOfWeekIn2021.getDayOfWeek();
    assertEquals(week, result);
  }

}