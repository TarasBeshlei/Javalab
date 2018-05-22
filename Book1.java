package com.company;

public class Book {
    private String bookname;
    private int amount;
    private int price;
    private String covertype;
    private String author;
    public static int totalPrice = 0;

    public Book() {

    }

    public Book(String bookname, int amount, int price, String author){
        this.bookname = bookname;
        this.amount = amount;
        this.price = price;
        this.author = author;


    }



    public Book(String bookname, int amount, int price, String covertype, String author){
        this.bookname = bookname;
        this.amount = amount;
        this.price = price;
        this.covertype = covertype;
        this.author = author;


    }


    @Override
    public String toString() {

        return " Book Name: "+this.getBookname()+"\n Amound: "+this.getAmount()+"\n Number of pages: "+this.getPrice()+"\n Cove type: "+this.getCovertype()+"\n Author: "+this.getAuthor();
    }

    static void printStaticSum(){
        System.out.println("Total price of all books " + totalPrice);
    }

    public void printSum(){
        System.out.println("Book Name: "+ getBookname()+"Amount: "+ getAmount()+"Price:" + getPrice());
    }

    public void resreValue(String bookname, int amount, int price, String covertype, String author){
        setBookname(bookname);
        setAmount(amount);
        setPrice(price);
        setCovertype(covertype);
        setAuthor(author);
    }



    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        totalPrice = totalPrice - this.price + price;
        this.price = price;
    }

    public String getCovertype() {
        return covertype;
    }

    public void setCovertype(String covertype) {
        this.covertype = covertype;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
