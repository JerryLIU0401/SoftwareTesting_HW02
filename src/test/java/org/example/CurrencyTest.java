package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {
  @ParameterizedTest
  @ValueSource(ints = {200, 20, 0}) // 幣值
  public void testCurrency(int amount) {
    Currency nt = new Currency(amount, "NT"); // 當幣值是NT
    Currency us = new Currency(amount, "US"); // 當幣值是US
    assertAll("add",
            ()-> assertEquals(nt.add(nt).getAmount(), amount + amount), // 測試NT + NT
            ()-> assertEquals(us.add(us).getAmount(), amount + amount), // 測試US + US
            ()-> assertEquals(nt.add(us).getAmount(), amount + amount/30), // 測試NT + US
            ()-> assertEquals(us.add(nt).getAmount(), amount + amount*30) // 測試US + NT
            );
  }

}