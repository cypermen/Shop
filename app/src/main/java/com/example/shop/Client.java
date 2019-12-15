package com.example.shop;

public class Client {
    private Order order;

    public void Client (){
        this.order = new Order();
    }

    public void showOrder() {
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
