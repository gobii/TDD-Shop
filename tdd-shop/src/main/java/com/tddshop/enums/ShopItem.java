package com.tddshop.enums;

import java.math.BigDecimal;

public enum ShopItem {

  APPLE(new BigDecimal("0.60")), ORANGE(new BigDecimal("0.25"));

  private BigDecimal value;

  ShopItem(BigDecimal value) {
    this.value = value;
  }

  public BigDecimal getValue() {
    return value;
  }

}
