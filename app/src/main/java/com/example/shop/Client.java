package com.example.shop;

public class Client {
    private String name;
    private Order order;

    public void Client (String name){
        this.name = name;
        this.order = new Order();
    }

    public String getName(){
        return name;
    }

    public void showOrder() {
        System.out.println("Ваш заказ: ");
        order.showOrder();
    }

    public void pay() {
        if(order.isPayment() == true) {
            // вывести на экран,что ваш заказ оплачен
        } else {
            order.setPayment(true);
            //Вывести,что заказ успешно оплачен ,досвидания приходите ещё
        }
    }




}
