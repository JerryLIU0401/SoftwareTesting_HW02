package org.example;

public class Currency {
  private int amount;
  private String symbol;

  public Currency(int amount, String symbol) {
    this.amount = amount;
    this.symbol = symbol;
  }

  // 幣值相加的換算處理
  public Currency add(Currency other) {
    // NT + US
    if (other.getSymbol().equals("NT") && this.symbol.equals("US")) {
      int a = this.amount + other.nt2us();
      return new Currency(a, "US");
    }
    // US + NT
    else if (other.getSymbol().equals("US") && this.symbol.equals("NT")) {
      int a = this.amount + other.us2nt();
      return new Currency(a, "NT");
    }
    // NT + NT || US + US
    else {
      int a = this.amount + other.getAmount();
      return new Currency(a, this.getSymbol());
    }
  }

  public int nt2us() {
    return amount * 30;
  } // NT 轉 US

  public int us2nt() {
    return amount / 30;
  } // US 轉 NT

  public String getSymbol() {
    return symbol;
  }

  public int getAmount() {
    return amount;
  }
}


