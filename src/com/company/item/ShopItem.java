package com.company.item;

import com.company.FishingType;

public abstract class ShopItem {

    public String name;
    public String brand;
    public int amount;
    public double price;

    public abstract FishingType getFishingtype();

    public ShopItem(String name, String brand, int amount, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n Name " + this.getName() + " Brand " + this.getBrand() + " Amount " +this.getAmount() + " Price "
                + getPrice();
    }
}
