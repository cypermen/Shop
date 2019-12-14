package com.example.shop;

public class Product {
    private String name;
    private int price;
    private int amount;


    //конструктор
    public Product (String name, int price) {
        this.name = name;
        this.price = price;
        this.amount = (int) (Math.random() * ((100 - 50) + 1)) + 50;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public int getAmount() {
        return amount;
    }


    public void setAmount(){
        this.amount-=1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice (int price) {
        this.price = price;
    }

}
