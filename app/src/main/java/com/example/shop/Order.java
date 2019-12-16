package com.example.shop;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Order implements Serializable {
    public Map<String, Integer> orderlist = new HashMap<String, Integer>(); //продукты в заказе

    //добавить товар к Заказу
    public void addProdToOrder(String product) {
        if(!orderlist.containsKey(product)) {
            orderlist.put(product,1);

        }else if (orderlist.containsKey(product)){
            orderlist.put(product,orderlist.get(product) + 1);

        }else {
        }
    }


    public Integer toString(String name) {
        return orderlist.get(name);
    }
}
