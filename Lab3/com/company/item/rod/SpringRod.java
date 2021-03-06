package com.company.item.rod;

import com.company.FishingType;
import com.company.item.ShopItem;

public class SpringRod extends ShopItem {


   private final FishingType fishingtype = FishingType.SPRING;

    public SpringRod(String name, String brand, int amount, int price) {
        super(name, brand, amount, price);
    }

    public FishingType getFishingtype() {
        return fishingtype;
    }
}
