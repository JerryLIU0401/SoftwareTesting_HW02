package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
  @ParameterizedTest
  @CsvSource({"1.7, 63.0",
  "0.0, 0.0",
  "-1.0, 60.0"})
  public void testCalculator(double h, double w) {
    BMICalculator bmiCalculator = new BMICalculator(h, w);
    double result = bmiCalculator.getBmi();
    assertEquals(h/(w*w), result);
  }

}

