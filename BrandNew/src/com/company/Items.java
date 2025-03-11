package com.company;

import java.util.ArrayList;

public class Items extends Filter implements Prices  {
    String Item_Category;
    String Brand;
    String Gender_Category;
    String Color;
    ArrayList<String> AvailableSizes;
    String Type;
    int Stock;
    String Frame;
    String Cut;
    double Price;

    public Items() {};

    public static ArrayList<Items> items_array = new ArrayList<Items>();
    public static ArrayList<Items> filtered_items_array = new ArrayList<Items>();
    public Items(String Item_Category, String Brand, String Gender_Category, String Color,
                 ArrayList<String> AvailableSizes, String Type, int Stock, String Frame, String Cut , double Price)
    {

        this.Item_Category = Item_Category;
        this.Brand = Brand;
        this.Gender_Category = Gender_Category;
        this.Color = Color;
        this.AvailableSizes = AvailableSizes;
        this.Type = Type;
        this.Stock = Stock;
        this.Frame = Frame;
        this.Cut = Cut;
        this.Price = Price;
    }
    public static void Add_Item(Items item ) {
   items_array.add(item);
    }
    public static void remove(Items item ) {
 items_array.remove(item);
    }

    public double getPrice() {
        return this.Price;
    }

    public void getDiscount(double Discount) {
        Price = this.Price - Discount;
    }
    public void getDiscount(double Discount, char perc) {
        if (perc == '%')
            Price = this.Price * (1-Discount);
    }

    public void ChangePrice() {}
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category, String Color, String Type, int Stock, String Frame, String Cut , double Price){
       if(!filtered_items_array.isEmpty()){
           filtered_items_array.removeAll(filtered_items_array);
       }
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category, String Color, String Type, int Stock, String Frame, String Cut ){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category, String Color, String Type, int Stock, String Frame){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category, String Color, String Type, int Stock){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category, String Color, String Type){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category, String Color){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand, String Gender_Category){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category, String Brand){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }
    public ArrayList<Items> FilterItems(String Item_Category){
        filtered_items_array.removeAll(filtered_items_array);
        return filtered_items_array;
    }


}
