package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {
  @ParameterizedTest
  @ValueSource(ints = {200, 20, 0})
  public void testCurrency(int amount) {
    Currency nt = new Currency(amount, "NT");
    Currency us = new Currency(amount, "US");
    Currency NTPlusNT = nt.add(nt);
    Currency USPlusUS = us.add(us);
    assertAll("add",
            ()-> assertEquals(nt.add(nt).getAmount(), amount + amount),
            ()-> assertEquals(us.add(us).getAmount(), amount + amount),
            ()-> assertEquals(nt.add(us).getAmount(), amount + amount/30),
            ()-> assertEquals(us.add(nt).getAmount(), amount + amount*30)
            );
  }

}