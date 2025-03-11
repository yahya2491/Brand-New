package com.company;

import java.util.ArrayList;

public class Cart
{
    public static ArrayList<Items> items_inCart = new ArrayList<Items>();
    public static void Add_To_Cart(Items item ){
        if(item.Stock > 1)
            item.Stock--;
        else Items.remove(item);
    }
    public static void PurchaseCart() {
        if (items_inCart.isEmpty() == false) {
            Order order = new Order();
            order.PlaceOrder(items_inCart);
        }
    }
}
