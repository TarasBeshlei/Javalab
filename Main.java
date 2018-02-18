package com.company;

public class Main{

    public static void main(String[] args) {

        Book1 Potter = new Book1();

        Book1 Witcher = new Book1("The Witcher", 30, 85,"Andrzej Sapkowski");

        Book1 King = new Book1("11.22.63", 10,100, "solid", "Stephen King");

        Potter.setBookname("Harry Potter");
        Potter.setAmount(30);
        Potter.setPrice(150);
        Potter.setCovertype("solid");
        Potter.setAuthor("J.K.Rowling");
        System.out.println(Potter);
        System.out.println(Witcher);
        System.out.println(King);
        Book1.printStaticSum();
        Potter.printSum();
        Witcher.printSum();
        King.printSum();
        Potter.resreValue("Shine ", 10, 200, "soft", "Stephen King");
        Witcher.resreValue("Metro ", 5, 400, "solid", "Dmitry Gluhovsky");
        King.resreValue("It ", 60, 250, "soft", "Stephen King");
        System.out.println(Potter);
        System.out.println(Witcher);
        System.out.println(King);
        Book1.printStaticSum();
        Potter.printSum();
        Witcher.printSum();
        King.printSum();






    }
}
