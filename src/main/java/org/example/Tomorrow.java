package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tomorrow {
  // 使用 java.time 獲取日期
  private LocalDate today;
  private LocalDate tomorrow;

  DateTimeFormatter formatter;

  public Tomorrow(int year, int month, int day) {
    this.today = LocalDate.of(year, month, day); // 獲取今天日期
    this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // 指定輸出格式
  }

  public String getToday() {
    String formatToday = today.format(formatter); // 轉成字串
    return formatToday;
  }

  public String getTomorrow() {
    this.tomorrow = today.plusDays(1); // 計算明天日期
    String formatTomorrow = tomorrow.format(formatter); // 轉成字串
    return formatTomorrow;
  }
}
