package com.example.shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> orderlist = new HashMap<Product, Integer>(); //продукты в заказе
    private boolean payment = false;    //оплачен ли заказ

    //добавить товар к Заказу
    public void addProdToOrder(Product product) {
        if(product.getAmount() != 0 && !orderlist.containsKey(product)) {
            orderlist.put(product,1);
            product.setAmount();

        }else if (orderlist.containsKey(product) && product.getAmount() != 0){
            orderlist.put(product,orderlist.get(product) + 1);
            product.setAmount();
        }else {
            //Вывод того что этот товар закончился
        }
    }

    //показать Заказ
    public void showOrder() {
        //Вывести на экран (Можно открыть новый активити с)
    }


    //оплачен или нет
    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean s) {
        payment = s;
    }


}
