package com.company.item.equipment;

import com.company.FishingType;
import com.company.item.ShopItem;

public class Boer extends ShopItem {


    private String size;
    private final FishingType fishingtype = FishingType.WINTER;


    public Boer(String name, String brand, int amount, int price) {
        super(name, brand, amount, price);

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amount = amount;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public FishingType getFishingtype() {
        return fishingtype;
    }


}
