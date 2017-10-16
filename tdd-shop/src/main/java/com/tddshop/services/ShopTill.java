package com.tddshop.services;

import java.math.BigDecimal;

import com.tddshop.enums.ShopItem;

/**
 * Represents a shop till
 * 
 * @author mike
 *
 */
public class ShopTill {

  /**
   * Scans an array of ShopItems and sums up the total cost for the checkout.
   * 
   * @param shopItems
   */
  public BigDecimal scanItems(ShopItem[] shoppingCart) {

    BigDecimal totalCost = new BigDecimal("0");

    for (ShopItem item : shoppingCart) {
      totalCost = totalCost.add(item.getValue());
    }

    return totalCost;
  }
}
