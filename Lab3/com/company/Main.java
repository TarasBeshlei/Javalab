package com.company;

import com.company.item.ShopItem;
import com.company.item.equipment.Boer;
import com.company.item.equipment.Coil;
import com.company.item.equipment.Float;
import com.company.item.equipment.Hook;
import com.company.item.rod.AutumnRod;
import com.company.item.rod.SpringRod;
import com.company.item.rod.SummerRod;
import com.company.item.rod.WinterRod;

import java.util.List;

public class Main {

    public static void printList(List<ShopItem> List) {
            System.out.println(List);
    }



    public static void main(String[] args) {

        FishingShop equipment = new FishingShop();

        equipment.addGoods(new AutumnRod("Autumn Rod", "Fisher", 2, 20));
        equipment.addGoods(new SpringRod("Spring Rod", "Hunter", 14, 80));
        equipment.addGoods(new SummerRod("Summer Rod", "Acropolis", 11, 40));
        equipment.addGoods(new WinterRod("Winter Rod", "Fisher", 20, 50));
        equipment.addGoods(new Hook("Hook", "Hunter", 70, 10));
        equipment.addGoods(new Boer("Boer", "Acropolis", 10, 100));
        equipment.addGoods(new Coil("Coil", "Hunter", 40, 80));
        equipment.addGoods(new Float("Float", "Fisher", 100, 12));



        printList(equipment.getGoodList());
        printList(equipment.sortByPrice(equipment.getGoodList()));
        System.out.println("\nList of searched goods:\n");
        List<ShopItem> result = equipment.findByGroup(FishingType.SUMMER);
        printList(result);



    }
}
