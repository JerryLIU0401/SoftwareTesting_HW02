package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekIn2021 {
  private LocalDate date;
  private DayOfWeek dayOfWeek;

  public void setDate(int month, int day) {
    date = LocalDate.of(2021, month, day);
    dayOfWeek = date.getDayOfWeek();
  }

  public int getDayOfWeek() {
    return dayOfWeek.getValue();
  }
}
