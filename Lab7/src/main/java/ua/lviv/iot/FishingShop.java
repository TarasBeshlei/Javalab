package ua.lviv.iot;

import ua.lviv.iot.item.ShopItem;

import java.util.*;


public final class FishingShop {

    private String shopName;
    private String address;
    private String workingHours;


    private List<ShopItem> goodList = new LinkedList<>();


    public FishingShop(){

    }


    public FishingShop(String shopName, String address, String workingHours, LinkedList<ShopItem> goodList){

        setShopName(shopName);
        setAddress(address);
        setWorkingHours(workingHours);
        setGoodList(goodList);


    }


    public List<ShopItem> sortByPrice(List<ShopItem> result){
        result.sort((o1, o2) -> {
            if(o1.getPrice() == o2.getPrice()){
                return 0;
            } else if(o1.getPrice() < o2.getPrice()) {
                return -1;
            } else return 1;

        });
        return result;
    }

    public List<ShopItem> findByGroup(FishingType goodsType) {
        List<ShopItem> result = new LinkedList<>();
        goodList.stream().filter((goodList) -> ((goodList.getFishingType() == goodsType))).forEachOrdered((goodList) -> {
            result.add(goodList);
        });
        return result;
    }



    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }


    public List<ShopItem> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<ShopItem> goodList) {
        this.goodList = goodList;
    }

    public void addGoods(ShopItem goods) {
        this.goodList.add(goods);
    }
}


