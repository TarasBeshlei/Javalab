package ua.lviv.iot.item.rod;


import ua.lviv.iot.FishingType;
import ua.lviv.iot.item.ShopItem;

public class WinterRod  extends ShopItem {

    private final FishingType fishingtype = FishingType.SUMMER;

    public WinterRod(final String name, final String brand, final int amount, final int price) {
        super(name, brand, amount, price);
    }
    public FishingType getFishingType() {
        return fishingtype;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    }

    @Override
    public String toCSV() {
        return super.toCSV();
    }
}
