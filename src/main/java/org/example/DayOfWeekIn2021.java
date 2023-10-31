package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekIn2021 {
  // 使用 java.time 獲取日期
  private LocalDate date;
  private DayOfWeek dayOfWeek;

  public void setDate(int month, int day) {
    date = LocalDate.of(2021, month, day); // 輸入2021年幾月幾日
    dayOfWeek = date.getDayOfWeek(); // 回傳星期幾
  }

  public int getDayOfWeek() {
    return dayOfWeek.getValue();
  }
}
