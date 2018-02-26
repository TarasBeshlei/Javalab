package com.company.item.equipment;

import com.company.FishingType;
import com.company.item.ShopItem;

public class Coil extends ShopItem {



    public final FishingType fishingtype = FishingType.SUMMER;

    public Coil(String name, String brand, int amount, int price){
        super(name, brand, amount, price);

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amount = amount;


    }
    public FishingType getFishingtype() {
        return fishingtype;
    }
}
