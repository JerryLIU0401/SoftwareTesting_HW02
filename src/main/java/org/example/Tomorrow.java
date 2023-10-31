package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tomorrow {
  private LocalDate today;
  private LocalDate tomorrow;

  DateTimeFormatter formatter;

  public Tomorrow(int year, int month, int day) {
    this.today = LocalDate.of(year, month, day);
    this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
  }

  public String getToday() {
    String formatToday = today.format(formatter);
    return formatToday;
  }

  public String getTomorrow() {
    this.tomorrow = today.plusDays(1);
    String formatTomorrow = tomorrow.format(formatter);
    return formatTomorrow;
  }
}
