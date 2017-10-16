package com.tddshop.services.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.tddshop.enums.ShopItem;
import com.tddshop.services.ShopTill;

public class ShopTillTest {

  private final ShopItem[] shopingCart = {ShopItem.ORANGE, ShopItem.APPLE, ShopItem.APPLE, ShopItem.ORANGE,
      ShopItem.APPLE, ShopItem.ORANGE, ShopItem.ORANGE};

  private final BigDecimal totalCostShopingCart = new BigDecimal("2.80");

  private final BigDecimal totalCostShopingCartWithOffers = new BigDecimal("1.95");

  @Test
  public void scanItemsWithOfferCorrectTotalCostTest() {

    ShopTill shopTill = new ShopTill();

    BigDecimal actualTotalCost = shopTill.scanItemsWithOffer(shopingCart);

    assertEquals(totalCostShopingCartWithOffers, actualTotalCost);
  }

  @Test
  public void scanItemsCorrectTotalCostTest() {

    ShopTill shopTill = new ShopTill();

    BigDecimal actualTotalCost = shopTill.scanItems(shopingCart);

    assertEquals(totalCostShopingCart, actualTotalCost);
  }


}
