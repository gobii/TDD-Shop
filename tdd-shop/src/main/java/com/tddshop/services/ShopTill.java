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

  /**
   * Scans an array of ShopItems and sums up the total cost for the checkout applying the special
   * offer:
   * 
   * Buy 1 Apple get 1 free; Buy 3 Oranges for the price of 2;
   * 
   * @param shopItems
   */
  public BigDecimal scanItemsWithOffer(ShopItem[] shoppingCart) {
    BigDecimal totalCost = new BigDecimal("0");

    int appleCount = 0;
    int orangeCount = 0;

    for (ShopItem item : shoppingCart) {
      totalCost = totalCost.add(item.getValue());
      switch (item) {
        case APPLE:
          appleCount++;
          if (appleCount == 2) {
            totalCost = totalCost.subtract(item.getValue());
            appleCount = 0;
          }
          break;
        case ORANGE:
          orangeCount++;
          if (orangeCount == 3) {
            totalCost = totalCost.subtract(item.getValue());
            orangeCount = 0;
          }
          break;
        default:
          break;
      }
    }

    return totalCost;
  }
}
