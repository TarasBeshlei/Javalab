package com.company.item.equipment;

import com.company.FishingType;
import com.company.item.ShopItem;

public class Hook extends ShopItem {

     final FishingType fishingtype = FishingType.AUTUMN;

    public Hook(String name, String brand, int amount, int price) {
        super(name, brand, amount, price);

    }

    public FishingType getFishingtype() {
        return fishingtype;
    }
}