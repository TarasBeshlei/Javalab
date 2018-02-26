package com.company.item.rod;

import com.company.FishingType;
import com.company.item.ShopItem;

public class AutumnRod extends ShopItem {


    private final FishingType fishingtype = FishingType.AUTUMN;

    public AutumnRod(String name, String brand, int amound, int price){

        super(name, brand, amound, price);

}

    public FishingType getFishingtype() {
        return fishingtype;
    }
}
